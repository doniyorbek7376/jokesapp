package uz.doniyorbek7376.jokesapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisService implements JokesService {

    @Override
    public String getRandomJoke() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

        return quotes.getRandomQuote();
    }
}
