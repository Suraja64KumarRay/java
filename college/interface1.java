interface printable {
    void print();
}

class document implements printable {
    public void print() {
        System.out.println("Printing documnet");
    }
}

public class interface1 {
    public static void main(String[] args)     {
        document d = new document();
        d.print();
    }
}
