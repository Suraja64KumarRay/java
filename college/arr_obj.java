import java.util.*;
class Employee {
    int id;
    String name;
    int salary;    
}
class Employeesalary {
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employee : ");
        int n = sc.nextInt();

        Employee[] e = new Employee[n];
        for(int i=0;i<n;i++)
        {
            e[i] = new Employee();
            System.out.print("Enter the id,name and salary :");
            e[i].id=sc.nextInt();
            sc.nextLine(); // Golden rule
            e[i].name=sc.nextLine();
            e[i].salary=sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\n Employee details :-");
        for(int i=0;i<n;i++)
        {
            System.out.println("id : "+e[i].id+" "+"name : "+e[i].name+" "+"salary : "+e[i].salary);
        }
    }
}
