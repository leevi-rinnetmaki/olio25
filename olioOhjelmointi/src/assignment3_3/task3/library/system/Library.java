package assignment3_3.task3.library.system;
import assignment3_3.task3.library.model.Book;
import assignment3_3.task3.library.model.LibraryMember;

import java.util.ArrayList;
import java.util.Iterator;

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
        Iterator<Book> iterator = books.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();

            if (book.getTitle().equals(title) && !book.getReserved()) {
                libraryMember.addBorrowedBook(book);
                iterator.remove();
                return;
            } else if (book.getTitle().equals(title) && book.getReserved()) {
                if (libraryMember.getReservedBooks().contains(book.getTitle())) {
                    book.setReserved(false);
                    libraryMember.addBorrowedBook(book);
                    iterator.remove();
                    return;
                }
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

    public void reserveBook(String borrowerName, String title) {
        LibraryMember libraryMember = getLibraryMember(borrowerName);
        for (Book book : books) {
            if(book.getTitle().equals(title)){
                book.setReserved(true);
                libraryMember.addReservedBook(book.getTitle());
            }
        }
    }

    public void unreserveBook(String borrowerName, String title) {
        LibraryMember libraryMember = getLibraryMember(borrowerName);
        Book book = libraryMember.getBorrowedBook(title);
        book.setReserved(false);
        libraryMember.removeBorrowedBook(title);
    }

    public void showReservedBooks(String reserver) {
        LibraryMember libraryMember = getLibraryMember(reserver);
        for (String book : libraryMember.getReservedBooks()) {
            System.out.println(book);
        }

    }
}
