import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract void area();
}

// Circle class
class Circle extends Shape {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    void setValues(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}

// Main class
public class abstract2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        System.out.print("Enter radius: ");
        double rad = sc.nextDouble();
        c.setRadius(rad);
         c.area();

        System.out.print("Enter length: ");
        double len = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double br = sc.nextDouble();

        r.setValues(len, br);

       
        r.area();
    }
}
