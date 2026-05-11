public class prime2 {
    public static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        if(n==2)
        {
            return true;
        }
        if(n%2==0)
        {
            return false;
        }
        for(int i=3;i*i<=n;i+=2)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void primerange(int s,int e)
    {
        for(int i=s;i<=e;i++)
        {
            if(isprime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        primerange(20, 80);
        
    }
}
