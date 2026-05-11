import java.util.*;

public class ternary2 {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String rptcd = number >= 33 ? "pass" : "fail";
        System.out.println(rptcd);
    }
}