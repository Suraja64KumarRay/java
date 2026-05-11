public class counting_sort {
    public static void contsort(int arr[])
    { 
        // Find the largest element as the array size depends on index range, not count.
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            largest = Math.max(largest, arr[i]);
        }
        // create count array
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++)
        {
            count[arr[i]]++;  // store the frequency of each element
        }
        // Sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
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
        int arr[]={2,3,1,4,3,1,6,5,7};
        contsort(arr);
        printarr(arr);
    }
}
