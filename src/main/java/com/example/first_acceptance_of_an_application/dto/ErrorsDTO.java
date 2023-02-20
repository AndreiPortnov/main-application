package com.example.first_acceptance_of_an_application.dto;

import org.springframework.http.HttpStatusCode;

public class ErrorsDTO {

    private String exeptionMessage;

    public String getExeptionMessage() {
        return exeptionMessage;
    }

    public void setExeptionMessage(String exeptionMessage) {
        this.exeptionMessage = exeptionMessage;
    }
}
