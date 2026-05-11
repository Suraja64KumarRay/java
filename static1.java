class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}

public class static1 {
    public static void main(String[] args) {

        Student.schoolName = "MCNL";

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(Student.schoolName);
    }
}

