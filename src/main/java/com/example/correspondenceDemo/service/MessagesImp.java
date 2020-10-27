package com.example.correspondenceDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessagesImp implements Messages {

    @Override
    public String getHelloMessage() {
        return "Hello Persistent !!";
    }
}
