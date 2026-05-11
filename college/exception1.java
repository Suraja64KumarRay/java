public class exception1 {
    public static void main(String[] args) {
        int age = 115;

        if(age <= 18) {
            throw new ArithmeticException("You are below age!!!");
        }
        System.out.println("Above the required age");
    }
}
