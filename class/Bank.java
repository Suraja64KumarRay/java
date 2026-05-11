class Bank {

    // Method to be overridden
    double getRateOfInterest() {
        return 0;
    }

    // main method inside Bank class
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        System.out.println("Interest rate is: " + b.getRateOfInterest());

        b = new HDFC();
        System.out.println("Interest rate is: " + b.getRateOfInterest());

        b = new ICICI();
        System.out.println("Interest rate is: " + b.getRateOfInterest());
    }
}

class SBI extends Bank {
    double getRateOfInterest() {
        return 4.5;
    }
}

class HDFC extends Bank {
    double getRateOfInterest() {
        return 5.3;
    }
}

class ICICI extends Bank {
    double getRateOfInterest() {
        return 6.5;
    }
}
