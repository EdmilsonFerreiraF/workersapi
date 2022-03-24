package com.edmilson.workersapi.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MessageResponseDTO {

    private String message;

    public static Object message(String string) {
        return null;
    }
}