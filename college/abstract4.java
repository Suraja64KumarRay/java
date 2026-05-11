import java.util.Scanner;

abstract class Bank {
    double rate;   // variable to store rate

    void setRate(double r) {
        rate = r;
    }

    double calculateInterest(double p, double t) {
        return (p * rate * t) / 100;
    }
}

class SBI extends Bank {
}

class ICICI extends Bank {
}

public class abstract4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        SBI sbi = new SBI();
        ICICI icici = new ICICI();

        System.out.print("Enter SBI Rate: ");
        sbi.setRate(sc.nextDouble());

        System.out.print("Enter ICICI Rate: ");
        icici.setRate(sc.nextDouble());

        System.out.println("SBI Interest: " + sbi.calculateInterest(p, t));
        System.out.println("ICICI Interest: " + icici.calculateInterest(p, t));
    }
}
