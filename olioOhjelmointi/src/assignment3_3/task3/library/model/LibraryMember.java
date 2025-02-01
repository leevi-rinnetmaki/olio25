package assignment3_3.task3.library.model;

import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private int memberId;
    private ArrayList<Book> borrowedBooks = new ArrayList<>();
    private ArrayList<String> reservedBooks = new ArrayList<>();

    public LibraryMember(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }
    public String getName() {
        return name;
    }
    public int getMemberId() {
        return memberId;
    }
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
    public void addBorrowedBook(Book book) {
        borrowedBooks.add(book);
    }
    public Book getBorrowedBook(String title) {
        for (Book book : borrowedBooks) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void removeBorrowedBook(String title) {
        borrowedBooks.remove(getBorrowedBook(title));
    }

    public void addReservedBook(String title) {
        reservedBooks.add(title);
    }

    public ArrayList<String> getReservedBooks() {
        return reservedBooks;
    }
}
