class student {
    String name;
    int age;

    void mca(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class clobj {
    public static void main(String[] args)
    {
        student obj = new student();
        obj.name="MCA";
        obj.age=22;
        obj.mca();
    }
}