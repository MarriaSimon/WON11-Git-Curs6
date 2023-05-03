package org.fasttrackit.homework;

public class QuotesEx {
    private int id;
    private String author;
    private String quote;
    private boolean favourite;

    public QuotesEx(int id, String author, String quote, boolean favourite) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = favourite;
    }

    public QuotesEx(String getQuote) {

    }


    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getQuote() {
        return quote;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}
