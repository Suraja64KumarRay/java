public class max {
    // Maximum between two integers
    static int maxi(int a,int b) {
        if(a>b) {
            return a;
        }
        else
        {
            return b;
        }
    }
     // Maximum between three integers
    static int maxi(int a,int b,int c) {
        int temp;
        if(a>b) {
            temp=a;
        }
        else {
            temp=b;
        }
        if(temp>c) {
            return temp;
        }
        else {
            return c;
        }

    }
    public static void main(String[] args) {
        System.out.println(maxi(12,43));
        System.out.println(maxi(90,55,99));
        System.out.println(maxi(83,22));
    }
}
