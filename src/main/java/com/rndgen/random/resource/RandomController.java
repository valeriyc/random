package com.rndgen.random.resource;

import com.rndgen.random.model.RandomNumber;
import com.rndgen.random.service.RandomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomController {
    private final RandomService randomService;

    @Autowired
    public RandomController(RandomService randomService) {
        this.randomService = randomService;
    }

    @GetMapping("/random")
    public RandomNumber getRandomNumber() {
        return randomService.getRandomNumber();
    }
}
