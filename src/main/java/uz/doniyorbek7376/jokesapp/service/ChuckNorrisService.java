package uz.doniyorbek7376.jokesapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisService implements JokesService {
    private final ChuckNorrisQuotes quotes;

    @Override
    public String getRandomJoke() {
        return quotes.getRandomQuote();
    }

    public ChuckNorrisService(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }
}
