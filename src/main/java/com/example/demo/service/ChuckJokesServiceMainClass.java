package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ChuckJokesServiceMainClass implements ChuckJokesService {

    private static List<String> jokes = new ArrayList();

    static {
        jokes = Arrays.asList("First joke",
                "Second joke",
                "Third joke",
                "Fourth joke",
                "Fifth joke",
                "Sixth joke");
    }
    /*
    static {
        jokes.add("First joke");
        jokes.add("Second joke");
        jokes.add("Third joke");
    }
    */

    @Override
    public String getChuckJoke() {
        int randomNumber = (int) (Math.random() * 6);
        return jokes.get(randomNumber);
    }
}
