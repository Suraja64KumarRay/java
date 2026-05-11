class Number extends Thread {
    public void run() {
        for(int i=1;i<=7;i++) {
            System.out.println("Number : "+i);

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Week extends Thread {
    public void run() {
        String day[] = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        for(int i=0;i<7;i++) {
            System.out.println("Day : "+day[i]);

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class threading5 {
    public static void main(String[] args) {
        Number n = new Number();
        Week w = new Week();

        n.start();
        w.start();
    }
}
