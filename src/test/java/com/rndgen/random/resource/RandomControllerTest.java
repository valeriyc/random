package com.rndgen.random.resource;

import com.rndgen.random.model.RandomNumber;
import com.rndgen.random.service.RandomService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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

    @ParameterizedTest
    @ValueSource(longs = {0L, 1L, 1234567L, Long.MAX_VALUE})
    void testRandomValues(long value) {
        RandomNumber num = new RandomNumber(1111L);
        when(randomService.getRandomNumber()).thenReturn(num);
        assertThat(randomController.getRandomNumber()).isEqualTo(num);
    }
}
