class numtabfve extends Thread {
    public void run() {
        int i=1;
        do {
            int res = i*5;
            System.out.println("Table of 5 :"+res);
            i++;
              try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        while(i<=10);
      
    }
}

class numtabtne extends Thread {
    public void run() {
         int i=1;
        do {
            int res = i*10;
            System.out.println("Table of 10 :"+res);
            i++;
             try {
                Thread.sleep(1000);
            }
            catch(Exception e) {
                System.out.println(e);
            }
        }
        while(i<=10);
       
    }
}



public class threading4 {
    public static void main(String[] args) {
        numtabfve n1 = new numtabfve();
        numtabtne n2 = new numtabtne();

        n1.start();
        n2.start();
    }
}
