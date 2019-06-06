package com.example.lab4nombresapi.controller;

import java.util.Random;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NombresController {

    private final Random random = new Random();
    @Value("${nombres:Default}")
    private String[] nombres;

    @GetMapping("/")
    public String obtenerLema() {
        return nombres[random.nextInt(nombres.length)];
    }
}
