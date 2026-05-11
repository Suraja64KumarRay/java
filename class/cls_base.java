public class cls_base {
    public static void main(String[] args)
    {
        pen p1 = new pen();
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);
        p1.color = "Yellow";
        System.out.println(p1.color); 

        bankaccount myacc = new bankaccount();
        myacc.username = "dkkfsdfsdkf";
        // myacc.password = "dfdfsdf";    // This line creates a error
        myacc.setpass("7493");

        if(myacc.checkpass("7493"))
        {
            System.out.println("Login successful");
        }
        else
        {
            System.out.println("Wrong password");
        }
    }
}

class bankaccount {
    public String username;
    private String password;
    public void setpass(String pwd) 
    {
        password = pwd;
    }

    public boolean checkpass(String pwd)
    {
        return password.equals(pwd);
    }
}
class pen {
    String color;
    int tip;

    void setcolor(String newclr)
    {
        color = newclr;
    }
    void settip(int newtip)
    {
        tip = newtip;
    }
}

// class student {
//     String name;
//     int age;
//     float percentage;
// }
