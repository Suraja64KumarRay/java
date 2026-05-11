class AgeExp extends Exception {
    AgeExp(String msg) {
        super(msg);
    }
}

class Test1 {
    public void check(int age) throws AgeExp {
        if (age < 18) {
            throw new AgeExp("Choti Bachhi Ho Kya");
        }
        else {
            System.out.println("Badi Bachhi");
        }
    }
}

public class decl_excepton {
    public static void main(String[] args) {
        Test1 t = new Test1();

        try {
            t.check(19);
        }
        catch(AgeExp e) {
            System.out.println(e.getMessage());   // getMessage() is a predefined method of Throwable class, inherited by Exception and all custom exception classes.
        }
    }
}
