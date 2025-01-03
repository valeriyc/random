package com.rndgen.random.service;

import com.rndgen.random.model.RandomNumber;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomService {

    private final Random random;

    public RandomService() {
        this.random = new Random();;
    }

    public RandomNumber getRandomNumber() {
        return new RandomNumber(random.nextLong(0, Long.MAX_VALUE));
    }
}
