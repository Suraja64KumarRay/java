public class deci_to_bnry {
    public static void decitobin(int n)
    {
        int mynum=n;
        int pow=0;
        int binnum=0;

        while (n>0) {
            int rem=n%2;  //remainder
            binnum=binnum+(rem*(int)Math.pow(10, pow));
            pow++;
            n=n/2;     //quotient
        }
        System.out.println("decimal of "+mynum+" = "+binnum);
    }
    public static void main(String[] args)
    {
        decitobin(6);
    }
}