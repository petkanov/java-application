package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WisdomController {
    private final WisdomService wisdomService;

    @GetMapping("/wisdom")
    public String getWisdom() {
        return wisdomService.getRandomWisdom();
    }
}
