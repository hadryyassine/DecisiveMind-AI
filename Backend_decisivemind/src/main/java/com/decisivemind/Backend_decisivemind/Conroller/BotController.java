package com.decisivemind.Backend_decisivemind.Conroller;



import com.decisivemind.Backend_decisivemind.dto.BotRequest;
import com.decisivemind.Backend_decisivemind.dto.ChatGptResponse;
import com.decisivemind.Backend_decisivemind.services.BotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bot")
@RequiredArgsConstructor
public class BotController {
    private final BotService botService;

    @PostMapping("/send")
    public ChatGptResponse sendMessage(@RequestBody BotRequest botRequest, @RequestParam Long userId) {
        return botService.askQuestion(botRequest, userId);
    }
}

