import java.util.*;

public class AreaCalculator {

    // Circle area
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Rectangle area
    public static double area(double length, double width) {
        return length * width;
    }

    // Square area
    public static double areaSquare(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        // Test the methods
        System.out.println("Area of Circle : " + area(5));
        System.out.println("Area of Rectangle : " + area(4, 6));
        System.out.println("Area of Square  " + areaSquare(3));
    }
}
