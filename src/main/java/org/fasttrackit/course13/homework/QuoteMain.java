package org.fasttrackit.course13.homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class QuoteMain {


    public static void main(String[] args) throws IOException {


        List<QuotesEx> quotes = new ArrayList<>();
        int id = 1;
        try (BufferedReader br = new BufferedReader(new FileReader("src/test/resources/quotes2.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("~");
                if (parts.length != 2) {
                    System.err.println("Invalid line: " + line);
                    continue;
                }
                String author = parts[0];
                String quote = parts[1];
                QuotesEx newQuotesEx = new QuotesEx(id, author, quote);
                quotes.add(newQuotesEx);
                id++;
                System.out.println("Author name : " + author);
                System.out.println("Quote:  " + quote);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        QuoteService quoteService = new QuoteService(quotes);
        List<String> allQuotes = quoteService.getAllQuotes();
        System.out.println(allQuotes);
        System.out.println(allQuotes.size());
        List<QuotesEx> getQuotesForAuthor = quoteService.getQuotesForAuthor("Frank Herbert");
        System.out.println("Quotes from author Frank Herbert ");
        getQuotesForAuthor.forEach(q -> System.out.println(q.getQuote()));

        List<String> authors = quoteService.getAuthors();
        System.out.println("\nAuthors:");
        authors.forEach(System.out::println);


        quoteService.setFavourite(10);


        List<QuotesEx> favorites = quoteService.getFavourites();
        System.out.println("\nFavorites:");
        favorites.forEach(q -> System.out.println(q.getQuote()));


        String randomQuote = quoteService.getRandomQuote();
        System.out.println("\nRandom quote:");
        System.out.println(randomQuote);


    }

}


