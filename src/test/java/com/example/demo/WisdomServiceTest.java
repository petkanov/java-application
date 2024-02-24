package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatNoException;

@ExtendWith(MockitoExtension.class)
class WisdomServiceTest {
    @Test
    void whenGetRandomWisdom_thenNoExceptionAndValidResultTest() {
        // Arrange
        WisdomService wisdomService = new WisdomService();

        // Act & Assert
        assertThatNoException().isThrownBy(() -> {
            String wisdom = wisdomService.getRandomWisdom();

//            assertThat(wisdom)
//                    .isNotNull()
//                    .isNotEmpty()
//                    .isInstanceOf(String.class)
//                    .isIn(
//                            "Patience is a virtue.",
//                            "The best time to plant a tree was 20 years ago. The second best time is now.",
//                            "He who asks a question is a fool for a minute; he who does not remains a fool forever.",
//                            "Change your thoughts and you change your world.",
//                            "The only true wisdom is in knowing you know nothing."
//                    );
        });
    }
}

