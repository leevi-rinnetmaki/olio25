package assignment3_3.task3.library.model;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean reserved=false;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    public boolean getReserved() {
        return reserved;
    }
}
