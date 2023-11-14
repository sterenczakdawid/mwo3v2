package com.example.mwo3pipelines.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private static int version = 0;

    @GetMapping("/")
    public String home() {
        return "Witaj w aplikacji na Azure 555, wersja: " + getVersion() + "\n";
    }

    public static int getVersion() {
        return version;
    }

    public static void incrementVersion() {
        version++;
    }


    public static int returnNumber(int a) {
        return a;
    }

}
