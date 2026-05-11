public class constructor1 {
    public static void main(String[] args)
    {
        student s1 = new student();
        student s2 = new student("skr");
        student s3 = new student(45);

        System.out.println(s1);
        System.out.println(s2.name);
        System.out.println(s3.age);
    }
}

class student {
    String name;
    int age;

    student() {
        System.out.println("Constructor is called");
    }
    student(String name) {
        this.name = name;
        System.out.println("Name is :"+name);
    }
    student(int age) {
        this.age = age;
        System.out.println("Age is :"+age);
    }
}












