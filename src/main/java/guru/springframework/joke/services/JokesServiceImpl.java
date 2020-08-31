package guru.springframework.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService{

	@Override
	public String getJoke() {
		
		ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
		return quotes.getRandomQuote();
	}
}
