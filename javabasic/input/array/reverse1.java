import java.util.Scanner;
public class reverse1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int [n];
        
        System.out.println("Enter the array element :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int start=0;
        int end=n-1;

        while (start<end) {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        System.out.println("Reverse array :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
