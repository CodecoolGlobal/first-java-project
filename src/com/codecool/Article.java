package com.codecool;

public class Article {

    private static final int DEFAULT_QUOTATIONS = 0;

    private final String title;
    private final String author;
    private int quotations;

    public Article(String title, String author) {
        this(title, author, DEFAULT_QUOTATIONS);
    }

    public Article(String title, String author, int quotations) {
        this.title = title;
        this.author = author;
        this.quotations = quotations;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuotations() {
        return quotations;
    }

    public void setQuotations(int quotations) {
        this.quotations = quotations;
    }

    public void publish() {
        if (quotations != 0)
        {
            throw new NonzeroQuotationsRuntimeException();
        }

        // todo publish
    }

    public String createDescription()
    {
        return "Title: " + title + ", Author: " + author + ", Quotations: " + quotations;
    }

    public String createDescription(String prefix)
    {
        return prefix + " - " + createDescription();
    }

    public void incrementQuotations()
    {
        quotations++;
    }
}
