package com.example.lab4lemasapi.controller;

import java.util.Random;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class LemasController {

    private final Random random = new Random();
    @Value("${lemas:Default}")
    private String[] lemas;

    @GetMapping("/")
    public String obtenerLema() {
        return lemas[random.nextInt(lemas.length)];
    }
}
