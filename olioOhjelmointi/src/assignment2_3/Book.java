package assignment2_3;
import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int year;
    private double rating;
    private ArrayList<String> review = new ArrayList<>();

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    int getYear() {
        return year;
    }
    double getRating() {
        return rating;
    }
    String getReview(int index) {
        return review.get(index);
    }
    ArrayList<String> getReviews() {
        return review;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    public void addReview(String review) {
        this.review.add(review);
    }


}
