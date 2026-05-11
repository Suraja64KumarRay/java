class main {
    void speed()  {
        System.out.println("Vehicle has normal speed");
    }
}
class bike extends main {
    void speed() {
        System.out.println("Bike is fast");
    }
}
class car extends main {
    void speed() {
        System.out.println("Car is fast");
    }
}
class dydispatch {
    public static void main(String[] args) {
        main v;
        v=new bike();
        v.speed();
        v=new car();
        v.speed();
    }
}