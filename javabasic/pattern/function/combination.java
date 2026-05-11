public class combination {
    public static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static int binomcoeff(int n,int r)    
    {
        int ft_n=fact(n);
        int ft_r=fact(r);
        int ft_nr=fact(n-r);

        int bincof=ft_n/(ft_r*ft_nr);
        return bincof;
    }
    public static void main(String[] args)
    {
        System.out.println(binomcoeff(5,2));
    }
}
