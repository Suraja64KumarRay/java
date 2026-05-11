public class area1 {

    // Area of square
    static double area(double side) {
        return side * side;
    }

    // Area of rectangle
    static double area(double length, double width) {
        return length * width;
    }

    // Area of circle
    static double area(float radius) {
        return 3.14159 * radius * radius;
    }

    public static void main(String[] args) {

        double squareArea = area(5);
        double rectangleArea = area(10, 5);
        double circleArea = area(7f);

        System.out.println("Area of Square = " + squareArea);
        System.out.println("Area of Rectangle = " + rectangleArea);
        System.out.println("Area of Circle = " + circleArea);
    }
}
