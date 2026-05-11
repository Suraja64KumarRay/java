class NegativeNumberException extends Exception {
    NegativeNumberException(String msg) {
        super(msg);
    }
}

class testnum {
    public void check(int num) throws NegativeNumberException {
        if(num < 0) {
            throw new NegativeNumberException("The number is negative");
        }
        else if(num == 0){
            System.out.println("zero");
        }
        else {
            System.out.println("The number is positive");
        }
    }
}

public class neg_excptn {
    public static void main(String[] args) {
        testnum n = new testnum();
        try {
            n.check(-80);
        }
        catch(NegativeNumberException g) {
            System.out.println(g.getMessage());
        }
    }
}
