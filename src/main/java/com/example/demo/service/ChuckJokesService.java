package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ChuckJokesService implements ChuckJokes{

    private static List<String> jokes = new ArrayList();

    static {
        jokes.add("First joke");
        jokes.add("Second joke");
        jokes.add("Third joke");
    }
    @Override
    public String getChuckJoke() {
        int randomNumber = (int) (Math.random() * 3);
        return jokes.get(randomNumber);
    }
}
