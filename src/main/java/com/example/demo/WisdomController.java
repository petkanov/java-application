package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WisdomController {

    private final WisdomService wisdomService;

    public WisdomController(WisdomService wisdomService) {
        this.wisdomService = wisdomService;
    }

    @GetMapping("/wisdom")
    public String getWisdom() {
        return wisdomService.getRandomWisdom();
    }
}
