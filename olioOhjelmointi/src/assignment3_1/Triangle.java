package assignment3_1;

public class Triangle extends Shape{
    private double width;
    private double height;
    public Triangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return width * height * 0.5;
    }
}
