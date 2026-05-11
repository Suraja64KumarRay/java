public class lin_search {
    public static int linsrch(int number[],int ky)
    {
        for(int i=0;i<number.length;i++)
        {
            if(number[i]==ky)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int num[]={2,3,4,6,7,9,78,21};
        int key=3;

        int index=linsrch(num, key);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("number found at index :"+index);
        }
    }
}
