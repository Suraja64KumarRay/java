public class sub_arr3 {
    public static void maxsubarraysum(int num[])
    {
        int curr_sum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];

        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++)
        {
            int start=i;
            for(int j=i;j<num.length;j++)
            {
                int end=j;
                curr_sum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];
                
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
