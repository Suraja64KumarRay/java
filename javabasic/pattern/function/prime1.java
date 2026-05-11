public class prime1 {
    public static boolean isprime(int n)
    {
        // Edge cases :
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
        for(int i=3;i<=Math.sqrt(n);i+=2)  // i<=Math.sqrt(n)  can be written as i*i<=n --> it is more faster
        {
            if(n%i==0)
            {
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(isprime(-4));
    }
}
