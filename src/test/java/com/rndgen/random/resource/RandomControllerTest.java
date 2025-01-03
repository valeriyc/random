package com.rndgen.random.resource;

import com.rndgen.random.model.RandomNumber;
import com.rndgen.random.service.RandomService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class RandomControllerTest {

    @Mock
    RandomService randomService;

    @InjectMocks
    RandomController randomController;

    @Test
    void testRandomValues() {
        RandomNumber num = new RandomNumber(1111L);
        when(randomService.getRandomNumber()).thenReturn(num);
        assertThat(randomController.getRandomNumber()).isEqualTo(num);
    }
}
