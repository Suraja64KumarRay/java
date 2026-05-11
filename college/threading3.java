class numtabfv extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("Table of 2 : "+2+" * "+i+" = "+i*2);

            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class numtabtn extends Thread {
    public void run() {
        for(int i=1;i<=10;i++) {
            System.out.println("Table of 4 : "+4+" * "+i+" = "+i*4);

            try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}



public class threading3 {
    public static void main(String[] args) {
        numtabfv n1 = new numtabfv();
        numtabtn n2 = new numtabtn();

        n1.start();
        n2.start();
    }
}
