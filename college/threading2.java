class numThrd extends Thread {
    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("number :" + i);

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class LetterThrd extends Thread {
    public void run() {
        for(char c='A';c<='E';c++) {
            System.out.println("Letter :"+c);

            try {
                Thread.sleep(500);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

public class threading2 {
    public static void main(String[] args) {
        numThrd t1 = new numThrd();
        LetterThrd t2 = new LetterThrd();

        t1.start();
        t2.start();
    }
}
