import java.util.Arrays;
public class bin_search {
    public static int binary(int number[],int key)
    {
        int start=0,end=number.length-1;

        // This method is used for sorted array (Here the array.sort method is used to sort the array first)
        while (start<=end) {
            int mid=(start+end)/2;
            //compare
            if(number[mid]==key)
            {
                return mid;
            }
            if(number[mid]<key)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[]={34,54,6,78,2,76,89,33};  //Use a sorted array(ascending or descending order)
        // sort the array before search
        Arrays.sort(arr);
        System.out.println("The index of the number is : "+binary(arr, 2));
    }
}
