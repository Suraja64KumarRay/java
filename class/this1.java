class student {
    private int age;
    private String name;

    // setter    :- used to access the private data and for data hiding
    void setage(int age)
    {
        this.age=age;   // used to remove the confusion if the object name and parameter name is same
    }
    // getter
    int getage()
    {
        return age;
    }
    // setter
    void setname(String name)
    {
        this.name=name;
    }
    // getter
    String getname()
    {
        return name;
    }
}
public class this1 {
    public static void main(String[] args)
    {
        student s1 = new student();
         s1.setname("skr");
         s1.setage(22);

         System.out.println("Name : "+s1.getname());
         System.out.println("Age : "+s1.getage());
    }
}
