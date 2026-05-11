class singlethrd extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Number :"+i);
        }
    }
}

public class threading1 {
    public static void main(String[] args) {
        singlethrd s = new singlethrd();
        // s.run();
        s.start();
    }
}
