package com.decisivemind.Backend_decisivemind.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
public class ChatGptResponse implements Serializable {
    private String id;
    private String object;
    private String model;
    private LocalDate created;
    private List<Choice> choices;

    public void cleanupResponse() {
        for (Choice choice : choices) {
            choice.setText(choice.getText().replace("\n", " "));
        }
    }
}

