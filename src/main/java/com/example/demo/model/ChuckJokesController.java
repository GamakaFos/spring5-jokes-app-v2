package com.example.demo.model;


import com.example.demo.service.ChuckJokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ChuckJokesController {

    ChuckJokes chuckJokes;

    @Autowired
    public ChuckJokesController(ChuckJokes chuckJokes) {
        this.chuckJokes = chuckJokes;
    }

    public String getChuckJoke(){
        return chuckJokes.getChuckJoke();
    }
}
