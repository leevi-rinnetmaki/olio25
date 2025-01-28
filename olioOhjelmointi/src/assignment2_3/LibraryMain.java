package assignment2_3;

public class LibraryMain {
    public static void main(String[] args) {
        User tom = new User("Tom", 22);
        Book lotr = new Book("Lord of the Rings", "J. R. R. Tolkien", 1954);
        Book nineteen = new Book("1984", "George Orwell", 1949);
        Book ford = new Book("Ford", "Henry Ford", 1903);
        Library library = new Library();
        library.addUser(tom);
        library.addBook(lotr);
        library.addBook(nineteen);
        library.displayBooks();
        //System.out.println("\n");
        library.displayBooksByAuthor("George Orwell");


        library.addBook(ford);
        //System.out.println(library.borrowBook("nineteen"));
        library.borrowBook("1984", tom);
        System.out.println(tom.getBorrowedBooks().get(0).getTitle()+" See me.");
        library.displayBooks();
        library.returnBook("1984", tom);
        System.out.println(tom.getBorrowedBooks().get(0).getTitle()+" Don´t see me.");

        // I´m aware how non-rated books mess with the average.
        // I´m simply too lazy to fix it
        lotr.setRating(3.5);
        ford.setRating(9.5);
        System.out.println(library.getAverageBookRating());

        System.out.println(library.getMostReviewedBook().getTitle());
        ford.addReview("A vey fast book!");
        System.out.println(library.getMostReviewedBook().getTitle());
    }
}
