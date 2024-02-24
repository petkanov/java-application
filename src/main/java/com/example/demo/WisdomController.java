package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequiredArgsConstructor
public class WisdomController {
    private final WisdomService wisdomService;

    @GetMapping("/wisdom")
    public String getWisdom() {
        try {
            return wisdomService.getRandomWisdom();
        } catch (Exception e) {
        }
        return "bla";
    }
}
