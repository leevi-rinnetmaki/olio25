package assignment3_1;

import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle("red", 5.0));
        shapes.add(new Rectangle("green", 5.0, 5.0));
        shapes.add(new Triangle("blue", 5.0, 5.0));
        for (Shape s : shapes) {
            System.out.println(s.calculateArea()+s.color);
        }
    }
}
