package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@Service
public class MessageService {

    public Message getMessage() {
        return new Message("Hello from the service!");
    }


}
