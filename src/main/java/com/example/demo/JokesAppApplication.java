package com.example.demo;


import com.example.demo.model.ChuckJokesController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class JokesAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(JokesAppApplication.class, args);


		ChuckJokesController jokes = (ChuckJokesController) ctx.getBean("chuckJokesController");
		System.out.println(jokes.getChuckJoke());




	}

}
