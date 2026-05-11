public class large2 {
    public static void compnum(int num[])
    {
        int largest=num[0];
        int smallest=num[0];

        for(int i=0;i<num.length;i++)
        {
            if(num[i]>largest)
            {
                largest=num[i];
            }
            if (num[i]<smallest) {
                smallest=num[i];
            }
        }
        System.out.println("Smallest number is : "+smallest);
        System.out.println("Largest number is : "+largest);
    }
    public static void main(String[] args)
    {
        int number[]={2,4,5,6,8,34,688};
        compnum(number);
    }
}
