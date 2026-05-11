class inherite1 {
    public static void main(String[] args) {
        student s = new student();

        s.shw();
        s.show();
        s.read();
    }
}
class human {
    void shw()
    {
        System.out.println("human sleeps");
    }
}
class man extends human {
    void show() {
        System.out.println("man eats");
    }
}

class student extends man {
    void read() {
        System.out.println("student studies");
    }
}
