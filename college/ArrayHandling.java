import java.util.*;
public class ArrayHandling {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int[] arr = {12,34,65,78,90};

        try {
           System.out.println("Enter the index number : ");
           int index = sc.nextInt();
           System.out.print("Value at index "+index+" is "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:Inalid index.Please enter the index between 0 to 4");
        }
    }
}
