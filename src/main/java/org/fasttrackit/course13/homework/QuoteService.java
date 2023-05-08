package org.fasttrackit.course13.homework;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class QuoteService {
    private List<QuotesEx> quote;

    public QuoteService(List<QuotesEx> quote) {
        this.quote = quote;
    }


    public List<String> getAllQuotes() throws IOException {
        return quote.stream()
                .map(QuotesEx::getQuote)
                .collect(Collectors.toList());
    }

    public List<QuotesEx> getQuotesForAuthor(String author) {
        return quote.stream()
                .filter(a -> a.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<String> getAuthors() {
        return quote.stream()
                .map(QuotesEx::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }

    public void setFavourite(int id) {
        quote.stream()
                .filter(a -> a.getId() == (id))
                .findFirst()
                .ifPresent(c -> c.setFavourite(true));
    }

    public List<QuotesEx> getFavourites() {
        return quote.stream()
                .filter(QuotesEx::isFavourite)
                .collect(Collectors.toList());
    }

    public String getRandomQuote() {
        int randomIndex = new Random().nextInt(quote.size());
        return quote.get(randomIndex).getQuote();
    }
}
