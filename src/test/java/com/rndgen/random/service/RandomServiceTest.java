package com.rndgen.random.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class RandomServiceTest {

    @InjectMocks
    RandomService randomService;

    @Test
    void testRandomValues() {
        for (int i = 0; i < 100; i++) {
            var num = randomService.getRandomNumber().number();
            assertThat(num).isPositive();
        }
    }
}
