class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class testabcd {
    public void check(int sell) throws InsufficientBalanceException {
        int stock = 50000;

        if (sell > stock) {
            throw new InsufficientBalanceException("Product not avilable");
        }
        else {
            System.out.println("Product sold successfully");
        }
    }
}

public class Ecommerce_excptn {
    public static void main(String[] args) {
        testabcd t = new testabcd();
        try {
            t.check(89899);
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }    
}
