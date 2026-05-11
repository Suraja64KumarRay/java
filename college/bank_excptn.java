class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class testabcd {
    public void check(int amount) throws InsufficientBalanceException {
        int balance = 50000;

        if (amount > balance) {
            throw new InsufficientBalanceException("Transaction declined");
        }
        else {
            System.out.println("Transaction successful");
        }
    }
}

public class bank_excptn {
    public static void main(String[] args) {
        testabcd t = new testabcd();
        try {
            t.check(8899);
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }    
}
