package com.example.library.model;

public class Book {

    private Long id;
    private String title;
    private String isbn;
    private Long authorId;

    // Default constructor
    public Book() {}

    // Parameterized constructor
    public Book(Long id, String title, String isbn, Long authorId) {
        this.id = id;
        this.title = title;
        this.isbn = isbn;
        this.authorId = authorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }
}

