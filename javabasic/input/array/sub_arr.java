public class sub_arr {
    public static void subarray(int num[])
    {
        int tot_subarr=0;
        for(int i=0;i<num.length;i++)
        {
            int start=i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(num[k]+" ");
                }
                tot_subarr++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays : "+tot_subarr);
    }
    public static void main(String[] args)
    {
        int numbers[]={2,4,6,8,9,32};
        subarray(numbers); 
    }
}
