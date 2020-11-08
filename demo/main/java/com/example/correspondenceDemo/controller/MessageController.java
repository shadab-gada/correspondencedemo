package com.example.correspondenceDemo.controller;

import com.example.correspondenceDemo.service.MessagesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MessageController {

    @Autowired
    private MessagesImp messagesImp;


    @GetMapping("/")
    private String getHelloMessage() {
        return messagesImp.getHelloMessage();
    }

}
