package com.springframework.spring5jokesappv2.controller;

import com.springframework.spring5jokesappv2.services.JokesSevice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Khee Siang
 */
@Controller
public class JokeController {

    private final JokesSevice jokesSevice;

    public JokeController(JokesSevice jokesSevice) {
        this.jokesSevice = jokesSevice;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", jokesSevice.getJoke());

        return "index";
    }
}
