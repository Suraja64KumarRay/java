public class sub_arr2 {
    public static void maxsubarraysum(int num[])
    {
        int curr_sum=0;
        int a=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<num.length;i++)
        {
            int start=i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                curr_sum=0;
                for(int k=start;k<=end;k++)
                {
                    System.out.print(num[k]+" ");
                    curr_sum+=num[k];
                    a=curr_sum;
                    
                }
               System.out.println(" : sum of sub-array is : "+a);
                if(maxsum<curr_sum)
                {
                    maxsum=curr_sum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum is : "+maxsum);
    }
    public static void main(String[] args)
    {
        int numbers[]={2,4,6,8,9,32};
        maxsubarraysum(numbers); 
    }
}
