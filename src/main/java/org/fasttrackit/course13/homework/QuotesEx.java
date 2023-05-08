package org.fasttrackit.course13.homework;

public class QuotesEx {
    private int id;
    private String author;
    private String quote;
    private boolean favourite;
    public QuotesEx() {
    }

    public QuotesEx(int id, String author, String quote) {
        this.id = id;
        this.author = author;
        this.quote = quote;
        this.favourite = false;
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
        this.favourite = false;
    }
}
