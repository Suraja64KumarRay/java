public class Calculator {
     // Addition of two integers
    static int calculate(int a, int b) {
        return a + b;
    }

    // Addition of two double values
    static double calculate(double a, double b) {
        return a + b;
    }

    // Multiplication of two integers
    static int calculate(int a, int b, int dummy) {
        // dummy parameter is just to differentiate method signature
        return a * b;
    }

    public static void main(String[] args) {

        int sumInt = calculate(10, 20);
        double sumDouble = calculate(5.5, 4.5);
        int productInt = calculate(6, 7, 0);

        System.out.println("Addition of integers = " + sumInt);
        System.out.println("Addition of doubles = " + sumDouble);
        System.out.println("Multiplication of integers = " + productInt);
    }
}
