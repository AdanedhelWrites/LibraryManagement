package repository;

import repository.enums.EStatus;

public abstract class Book {
    private String isbn;
    private String title;
    private String author;
    private int publishedYear;

    public Book(String isbn, String title, String author, int publishedYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
    public abstract EStatus getStatus();
}