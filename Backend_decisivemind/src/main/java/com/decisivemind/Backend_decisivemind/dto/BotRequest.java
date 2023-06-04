package com.decisivemind.Backend_decisivemind.dto;


import lombok.Data;

import java.io.Serializable;

@Data
public class BotRequest implements Serializable {
    private String message;
}
