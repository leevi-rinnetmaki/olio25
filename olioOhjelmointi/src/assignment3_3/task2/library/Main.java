package assignment3_3.task2.library;
import assignment3_3.task2.library.model.Book;
import assignment3_3.task2.library.model.LibraryMember;
import assignment3_3.task2.library.system.Library;


public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.addLibraryMember(new LibraryMember("Ford", 1));
        lib.addLibraryMember(new LibraryMember("John", 2));
        lib.addLibraryMember(new LibraryMember("Mike", 3));
        lib.addLibraryMember(new LibraryMember("Bob", 4));

        lib.addBook(new Book("Rust in Peace", "Megadeth", "Mikä on isbn?"));
        lib.addBook(new Book("Peace sells, but who's buying?", "Megadeth", "."));

        lib.borrowBook("Ford", "Rust in Peace");
        System.out.println(lib.getLibraryMember("Ford").getBorrowedBook("Rust in Peace").getTitle());
        lib.returnBook("Ford","Rust in Peace");
        //System.out.println(lib.getLibraryMember("Ford").getBorrowedBook("Rust in Peace").getTitle());
    }
}
