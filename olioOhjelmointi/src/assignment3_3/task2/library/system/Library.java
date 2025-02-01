package assignment3_3.task2.library.system;
import assignment3_3.task2.library.model.Book;
import assignment3_3.task2.library.model.LibraryMember;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    ArrayList<LibraryMember> libraryMembers = new ArrayList<>();

    public Library() {

    }

    public void addBook(Book book) {
        books.add(book);
    }
    public void addLibraryMember(LibraryMember libraryMember) {
        libraryMembers.add(libraryMember);
    }

    public void borrowBook(String borrowerName, String title) {
        LibraryMember libraryMember = getLibraryMember(borrowerName);
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                libraryMember.addBorrowedBook(book);
                books.remove(book);
            }
        }
    }
    public void returnBook(String returnerName, String returnedBook) {
        LibraryMember libraryMember = getLibraryMember(returnerName);
        Book book = libraryMember.getBorrowedBook(returnedBook);
        books.add(book);
        libraryMember.removeBorrowedBook(returnedBook);
        //libraryMembers.remove(book);
    }

    public LibraryMember getLibraryMember(String name) {
        for (LibraryMember libraryMember : libraryMembers) {
            if(libraryMember.getName().equals(name)){
                return libraryMember;
            }
        }
        System.out.println("No such library member");
        return null;
    }
}
