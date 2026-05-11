public class constructor2 {
    public static void main(String[] args)
    {
        student s1=new student();
        s1.name="abc";
        s1.roll=122;
        s1.password="dfdf";

         
        student s2=new student(s1);
        System.out.println("----original object(s1)----");
        s1.display();

        System.out.println("----copy object(s2)----");
        s2.display();
    }
}

class student {
    String name;
    int roll;
    String password;

    student() {
        System.out.println(" Default Const. is called");;
    }

    // copy cnstructor
    student(student s) {
        System.out.println("copy const is called");
        this.name=s.name;
        this.roll=s.roll;
        // this.password=s.password;

    }

    void display() {
        System.out.println("Name     : " + name);
        System.out.println("Roll No  : " + roll);
        System.out.println("Password : " + password);
        System.out.println();
    }
}
