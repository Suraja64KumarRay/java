import java.util.Scanner;
abstract class shapes {
    abstract void area();
    void calculate() {
        System.out.print("Calculating the area of different shapes");
    }
}

class circle extends shapes {
    double radius;
    circle(double r) {
        radius = r;
    }
    void area() {
        double result = 3.14*radius*radius;
        System.out.println("The area of circle is : "+result);
    }
}

class rectangle extends shapes {
    double length,breadth;
    rectangle(double l,double b) {
        length = l;
        breadth = b;
    }
    void area() {
        double result = length*breadth;
        System.out.println("The area of rectangle is : "+result);
    }
}

class abstract1 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius :");
        double r = sc.nextDouble();

        System.out.print("Enter the length :");
        double l = sc.nextDouble();

        System.out.print("Enter the breadth :");
        double b = sc.nextDouble();

        shapes s1 = new circle(r);
        shapes s2 = new rectangle(l, b);

        s1.area();
        s2.area();
    }
}
