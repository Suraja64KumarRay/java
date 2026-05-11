import java.util.*;
public class brkcont2 {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the number : ");
            int number = sc.nextInt();

            if (number % 10 == 0) {
                break;
            }
            System.out.println(number);
        }while(true);
    }
}
