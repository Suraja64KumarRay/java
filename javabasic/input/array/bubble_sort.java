public class bubble_sort {
    public static void bblsrt(int ary[])
    {
        for(int turn=0;turn<ary.length-1;turn++)  // length-1 due to number of passes instead of number of elements
        {
            for(int j=0;j<ary.length-1-turn;j++)  // -1-turn due to one large element is already placed at the end.
            {
                if(ary[j]>ary[j+1])
                {
                    int temp=ary[j];
                    ary[j]=ary[j+1];
                    ary[j+1]=temp;
                }
            }
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
        bblsrt(arr);
        prntarr(arr);
    }
}
