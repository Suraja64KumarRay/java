abstract class Appliance {
    abstract void turnOn();
    abstract void turnOff();
    abstract void service();
}

class WashingMachine extends Appliance {

    void turnOn() {
        System.out.println("Washing Machine is turned ON.");
    }

    void turnOff() {
        System.out.println("Washing Machine is turned OFF.");
    }

    void service() {
        System.out.println("Washing Machine is under servicing.");
    }
}

class Refrigerator extends Appliance {

    void turnOn() {
        System.out.println("Refrigerator is turned ON.");
    }

    void turnOff() {
        System.out.println("Refrigerator is turned OFF.");
    }

    void service() {
        System.out.println("Refrigerator is under servicing.");
    }
}

public class abstract5 {
    public static void main(String[] args) {
        Appliance a;

        a=new WashingMachine();
        a.turnOn();
        a.turnOff();
        a.service();

        System.out.println(" ");
        
        a=new Refrigerator();
        a.turnOn();
        a.turnOff();
        a.service();
    }    
}
