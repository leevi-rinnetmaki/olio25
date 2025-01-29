package assignment3_1;

public class Circle extends Shape{

    double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args){
        Circle circle = new Circle("green",1);
        System.out.println(circle.calculateArea());
    }
}
