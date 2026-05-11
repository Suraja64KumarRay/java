public class butterfly {
    public static void btfly(int n)
    {
        // 1st half
        for(int i=1;i<=n;i++)
        {
            // stars b4 space
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
             // space
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print("   ");
            }
            // stars after space
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        // 2nd half
        for(int i=n;i>=1;i--)
        {
            // stars b4 space
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
             // space
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print("   ");
            }
            // stars after space
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        btfly(6);
    }
}
