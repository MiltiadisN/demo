package com.example.demo;

import lombok.Data;

@Data
public class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

}