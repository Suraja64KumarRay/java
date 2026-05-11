public class product {
    public static int mult(int x,int y)
    {
        int product=x*y;
        return product;
    }
    public static void main(String[] args)
    {
        int a=87;
        int b=3;
        int prdct=mult(a, b);
        System.out.println("The product of a and b is :"+prdct);
        prdct=mult(12,3);   
        System.out.println("The product of a and b is :"+prdct);
    }
}
