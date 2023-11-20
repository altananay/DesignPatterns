package main;

import java.time.LocalDateTime;

public class Memento {
    private String title;
    private String author;
    private String isbn;
    private LocalDateTime lastEdited;

    public Memento(String title, String author, String isbn, LocalDateTime lastEdited) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.lastEdited = lastEdited;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDateTime getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(LocalDateTime lastEdited) {
        this.lastEdited = lastEdited;
    }
}
