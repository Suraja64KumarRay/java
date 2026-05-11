abstract class Bank {
    abstract double getInterestRate();
}

class SBI extends Bank {
    double getInterestRate() {
        return 7.9;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

public class abstract3 {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("SBI Interest Rate: " + b.getInterestRate() + "%");

        b = new ICICI();
        System.out.println("ICICI Interest Rate: " + b.getInterestRate() + "%");
    }
}
