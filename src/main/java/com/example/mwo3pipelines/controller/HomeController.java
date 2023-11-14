package com.example.mwo3pipelines.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public String home() {
        return "Witaj w aplikacji na Azure 457\n" +
                "\nNumer wersji: " + appVersion;
    }


    public static int returnNumber(int a) {
        return a;
    }

}
