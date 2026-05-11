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

        // Student.schoolName = "MCNL";

        Student s1 = new Student();
        s1.schoolName="jjnnj";

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName="apple";
        System.out.println(s3.schoolName);

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);

    }
}
