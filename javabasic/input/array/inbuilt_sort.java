// For reverse :- Arrays <--> Collections
import java.util.Arrays;    
public class inbuilt_sort {
    public static void printarr(int arr[])  // int <--> Integer
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={5,3,4,1,2};      // int <--> Integer
        // Arrays.sort(arr);        // (arr) <--> (arr, Collections.reverseOrder())
        Arrays.sort(arr,0,3);   // (arr,0,3) <--> (arr, 0, 3, Collections.reverseOrder())
        printarr(arr);
    }
   
}