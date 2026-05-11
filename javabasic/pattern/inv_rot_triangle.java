public class inv_rot_triangle {
    public static void invrot(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("   ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        invrot(5);
    }
}
