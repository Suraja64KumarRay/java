// Kadane's Algorithm
public class sub_arr4 {
    public static void kadanes(int number[])
    {
        int maxsum=Integer.MIN_VALUE;
        int current_sum=0;

        for(int i=0;i<number.length;i++)
        {
            current_sum=current_sum+number[i];
            if(current_sum<0)
            {
                current_sum=0;
            }
            maxsum=Math.max(current_sum, maxsum);
        }
        System.out.println("Our maximum sub_array sum is : "+maxsum);
    }
    public static void main(String[] args)
    {
        int num[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(num);
    }
}
// more logic to be added for negative sum