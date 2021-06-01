package com.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Khee Siang
 */
@Service
public class JokesSeviceImpl implements JokesSevice {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesSeviceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
