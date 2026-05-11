public class posneg {
    public static void main(String[] args)    
    {
        int[] arr={2,-3,1,8,-6,0,0,9,-5};

        int poscount=0;
        int negcount=0;
        int zerocount=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                poscount++;
            }
            else if(arr[i]<0)
            {
                negcount++;
            }
            else
            {
                zerocount++;
            }
        }
        System.out.println("positive number :"+poscount);
        System.out.println("negative number :"+negcount);
        System.out.println("zero :"+zerocount);
    }
}
