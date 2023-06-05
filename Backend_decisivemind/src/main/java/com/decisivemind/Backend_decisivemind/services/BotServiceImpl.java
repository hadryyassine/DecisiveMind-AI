package com.decisivemind.Backend_decisivemind.services;

import com.decisivemind.Backend_decisivemind.configuaration.ChatGptConfig;
import com.decisivemind.Backend_decisivemind.dto.BotRequest;
import com.decisivemind.Backend_decisivemind.dto.ChatGptRequest;
import com.decisivemind.Backend_decisivemind.dto.ChatGptResponse;
import com.decisivemind.Backend_decisivemind.dto.Message;
import com.decisivemind.Backend_decisivemind.entities.User;
import com.decisivemind.Backend_decisivemind.repositories.UserRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class BotServiceImpl implements BotService {

    private static RestTemplate restTemplate = new RestTemplate();
    private final UserRepository userRepository;

    public BotServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //    Build headers
    public HttpEntity<ChatGptRequest> buildHttpEntity(ChatGptRequest chatRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.parseMediaType(ChatGptConfig.MEDIA_TYPE));
        headers.add(ChatGptConfig.AUTHORIZATION, ChatGptConfig.BEARER + ChatGptConfig.API_KEY);
        return new HttpEntity<>(chatRequest, headers);
    }

    //    Generate response
    public ChatGptResponse getResponse(HttpEntity<ChatGptRequest> chatRequestHttpEntity) {
        ResponseEntity<ChatGptResponse> responseEntity = restTemplate.postForEntity(
                ChatGptConfig.URL,
                chatRequestHttpEntity,
                ChatGptResponse.class);

        return responseEntity.getBody();
    }

    private String buildPrompt(String domainName, String userMessage) {
        return "ACT as " + domainName + " expert, Your task is to assist the user with difficult problem. I have a problem related to " + userMessage +
                ". Under the hood , First, brainstorm three distinct solutions. For each of the three proposed solutions, evaluate their potential. " +
                "Consider their pros and cons, initial effort needed, implementation difficulty, potential challenges, and the expected outcomes. " +
                "Assign a probability of success and a confidence level to each option based on these factors. For each solution, " +
                "deepen the thought process. Generate potential scenarios, strategies for implementation, any necessary partnerships " +
                "or resources, and how potential obstacles might be overcome. Also, consider any potential unexpected outcomes and" +
                " how they might be handled . All of this is due without displaying it in your answer . Based on the evaluations and scenarios, " +
                "In your answer , Display just the optimal solution with its success probability and an explanation of this solution.";
    }

    public ChatGptResponse askQuestion(BotRequest botRequest, Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UsernameNotFoundException("User not found with id : " + userId)); // Handle this exception as per your application's policy
        String domainName = user.getProfession();
        String prompt = this.buildPrompt(domainName, botRequest.getMessage());
        ChatGptResponse response = this.getResponse(
                this.buildHttpEntity(
                        new ChatGptRequest(
                                ChatGptConfig.MODEL,
                                prompt,
                                ChatGptConfig.TEMPERATURE,
                                ChatGptConfig.MAX_TOKEN,
                                ChatGptConfig.TOP_P)));

        response.cleanupResponse();
        return response;
    }


}
