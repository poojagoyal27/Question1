package com.exam.question1.mesage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Value("${messagemanifest:manifest_default}")
    private String messagemanifest;

    @Value("${messageenv:env_default}")
    private String messageenv;

    @GetMapping("/manifest")
    private String PrintMessage()
    {
        return messagemanifest;
    }
    @GetMapping("/env")
    private String PrintMessage1()
    {
        return messageenv;
    }

}
