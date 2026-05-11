public class swap {
    public static void swp(int x,int y)
    {
        int temp=x;
        x=y;
        y=temp;
        System.out.println("value of a :"+x);
        System.out.println("value of b :"+y);
    }
    public static void main(String[] args)
    {
        int a=10;
        int b=5;
        swp(a, b);
        System.out.println("value of a :"+a);
        System.out.println("value of b :"+b);
    }
}
 // In java only call by value is applied.