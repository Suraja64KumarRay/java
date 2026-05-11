public class try_catch {
    public static void main(String[] args) {
        // int b = 13/0;
        // System.out.println(b);
        try {
            int b = 13/0;
            System.out.println(b);
        }
        catch(ArithmeticException e) {
            System.out.println("Exception occurs due to arithmatic error");
        }
    }    
}
