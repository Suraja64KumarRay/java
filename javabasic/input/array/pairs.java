public class pairs {
    public static void printpairs(int num[])
    {
        int tot_pair=0;
        for(int i=0;i<num.length;i++)
        {
            int current=num[i];
            for(int j=i+1;j<num.length;j++)
            {
                System.out.print("("+current+","+ num[j]+")");
                tot_pair++;
            }
            System.out.println();
        }
        System.out.println("Total pairs are : "+tot_pair);  // Formula = n(n-1)/2
    }
    public static void main(String[] args)
    {
        int numbers[]={4,1,5,7,8,9};
        printpairs(numbers);
    }
}
