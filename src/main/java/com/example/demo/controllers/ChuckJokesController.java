package com.example.demo.controllers;


import com.example.demo.service.ChuckJokesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//("/")
public class ChuckJokesController {

    private final ChuckJokesService chuckJokes;

    @Autowired
    public ChuckJokesController(ChuckJokesService chuckJokes) {
        this.chuckJokes = chuckJokes;
    }


    public String getChuckJoke(){
        return chuckJokes.getChuckJoke();
    }

    @RequestMapping({"/", ""})
    public String getChuckJoke(Model model){

        model.addAttribute("joke", chuckJokes.getChuckJoke());

        return "index";
    }
}
