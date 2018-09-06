package com.coreen.javalib;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class JokeSupplier {
    private List<String> jokes = Arrays.asList(
            "What's the object-oriented way to become wealthy? Inheritance",
            "To understand what recursion is, you first need to understand recursion",
            "What do you call an alligator investigator? An investi-gator",
            "Why shouldn't you marry a tennis player? Because love means nothing to them",
            "Why did the golfer wear 2 pants? In case he got a hole in one",
            "What can you serve, but never eat? A volleyball"
    );

    public String getJoke() {
        final int random = new Random().nextInt(jokes.size());
        return jokes.get(random);
    }
}
