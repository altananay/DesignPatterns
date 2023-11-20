package main;

import java.time.LocalDateTime;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private LocalDateTime lastEdited;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        setLastEdited();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        setLastEdited();
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
        setLastEdited();
    }

    public LocalDateTime getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited() {
        this.lastEdited = LocalDateTime.now();
    }

    public Memento createUndo()
    {
        return new Memento(title, author, isbn, lastEdited);
    }

    public void restoreFromUndo(Memento memento)
    {
        title = memento.getTitle();
        author = memento.getAuthor();
        isbn = memento.getIsbn();
        lastEdited = memento.getLastEdited();
    }

    @Override
    public String toString() {
        return this.isbn + " " + this.author + " " + this.title + " edited: " + this.lastEdited;
    }
}