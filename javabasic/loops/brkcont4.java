import java.util.*;
public class brkcont4 {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the number : ");
            int number = sc.nextInt();

            if (number % 10 == 0) {
                continue;
            }
            System.out.println("The number is : " + number);
        }while(true);
    }
}
