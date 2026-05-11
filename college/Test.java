class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

class Test {
    public static void main(String[] args) {
        int num = -5;

        try {
            if (num < 0)
                throw new NegativeNumberException("Negative number not allowed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
