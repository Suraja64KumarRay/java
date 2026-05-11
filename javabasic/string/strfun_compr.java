public class strfun_compr {

    public static void main(String[] args) {
        String s1 = "suraja";
        String s2 = "suraja";
        String s3 = new String("suraja");

        if(s1 == s2) {
            System.out.println("strings are same");
        }
        else {
            System.out.println("string are not equa");
        }
        
        if(s1 == s3) {
            System.out.println("strings are same");
        }
        else {
            System.out.println("string are not equal");
        }
        if (s1.equals(s3)) {
            System.out.println("strings are same");
        }
        else {
            System.out.println("string are not equal");

        }
    }
}