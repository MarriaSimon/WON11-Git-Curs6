package org.fasttrackit.homework;

import org.fasttrackit.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.fasttrackit.homework.QuotesReading.readFullFile;

public class QuoteMain {

    public static void main(String[] args) throws IOException {


        List<QuotesEx> quotes = new ArrayList<>();
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("quotes.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = new String();
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("~");
            String author = parts[0];
            String quoteText = parts[1];
            QuotesEx quote = new QuotesEx(quoteText);
            quotes.add(quote);
            System.out.println("Author name : " + author);
            System.out.println("Quote:  " + quoteText);


        }
        QuoteService quoteService = new QuoteService(quotes);
        List<String> allQuotes = quoteService.getAllQuotes();
        System.out.println(allQuotes);
        System.out.println(allQuotes.size());


    }

}


