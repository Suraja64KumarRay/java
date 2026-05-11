public class type_promotion2 {
    public static void main(String[] args)
    {
        int a = 13;
        float b =43.32f;
        long c = 43;
        double d = 65;
        double ans = a+b+c+d;
        System.out.println(ans); // result will be converted to double(bigger than others) only
        
    }
}
