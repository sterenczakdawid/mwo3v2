package com.example.mwo3pipelines.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        String buildNumber = System.getProperty("build.number", "0.0.1");
        return "Witaj w aplikacji na Azureeee123\n" +
                "\nNumer wersji: " + buildNumber;
    }


    public static int returnNumber(int a) {
        return a;
    }

}
