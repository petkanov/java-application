package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class WisdomService {
    Integer SOmevalue;

    private final List<String> wisdoms = List.of(
            "Patience is a virtue.",
            "The best time to plant a tree was 20 years ago. The second best time is now.",
            "He who asks a question is a fool for a minute; he who does not remains a fool forever.",
            "Change your thoughts and you change your world.",
            "The only true wisdom is in knowing you know nothing."
    );
    private final Random Random = new Random();

    public String getRandomWisdom() {
        System.out.println(new Random().nextInt());

        int index = Random.nextInt(wisdoms.size());
        return wisdoms.get(index);
    }
}
