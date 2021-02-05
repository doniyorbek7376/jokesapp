package uz.doniyorbek7376.jokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisService implements JokesService {

    @Override
    public String getRandomJoke() {
        ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

        return quotes.getRandomQuote();
    }
}
