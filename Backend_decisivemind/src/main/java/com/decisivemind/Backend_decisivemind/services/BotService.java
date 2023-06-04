package com.decisivemind.Backend_decisivemind.services;


import com.decisivemind.Backend_decisivemind.dto.BotRequest;
import com.decisivemind.Backend_decisivemind.dto.ChatGptResponse;

public interface BotService {

    ChatGptResponse askQuestion(BotRequest botRequest);
}