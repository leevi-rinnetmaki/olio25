package assignment2_3;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public void addUser(User user) {
        users.add(user);
    }
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }
    public void displayBooksByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle());
            }
        }
    }
    public void borrowBook(String title, User user) {
        //return books.stream().filter(book -> book.getTitle().equals(title)).findFirst().orElse(null);
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                user.addBook(book);
            }
        }
    }
    public void returnBook(String title, User user) {
        for(Book book : user.getBorrowedBooks()){
            if (book.getTitle().equals(title)) {
                books.add(book);
                users.remove(book);
                break;
            }
        }
    }

    public boolean isBookAvailable(String title){
        for (Book book : books) {
            if (book.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    double getAverageBookRating() {
        double sum = 0;
        for (Book book : books) {
            sum += book.getRating();
        }
        return sum/books.size();
    }

    Book getMostReviewedBook(){
        Book mostReviewedBook = null;
        for (Book book : books) {
            if(mostReviewedBook==null || book.getReviews().size()>mostReviewedBook.getReviews().size()){
                mostReviewedBook = book;
            }
        }
        return mostReviewedBook;
    }

}
