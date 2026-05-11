public class insertion_sort {
    public static void insrt(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int previous=i-1;
            // Finding out the correct position to insert 
            while (previous >= 0 && arr[previous] > current) {
                arr[previous+1]=arr[previous];
                previous--;
            }
            // Insertion
            arr[previous+1] = current;
        }
    }
    public static void prntarr(int ary[])
    {
        for(int i=0;i<ary.length;i++)
        {
            System.out.print(ary[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int arr[]={5,4,1,3,2};
        insrt(arr);
        prntarr(arr);
    }
}
