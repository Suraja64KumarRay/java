import java.util.*;
public class String_handling {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        String input = sc.nextLine();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Convert integer :"+number);
        }
        catch(NumberFormatException e) {
            System.out.println("Invalid input!! Please enter a valid integer.");
        }
    }
}
