import java.util.*;

class InvalidUserName extends Exception {
    InvalidUserName(String msg) {
        super(msg);
    }
}

class InvalidPassword extends Exception {
    InvalidPassword(String msg) {
        super(msg);
    }
}

class testabcd {
    
    public void check(String username,String pass) throws InvalidUserName,InvalidPassword {
        String cu = "Suraja";
        String cp = "123";

        if (!username.equals(cu)) {
            throw new InvalidUserName("Incorrect Username");
        }
        if (!pass.equals(cp)) {
            throw new InvalidPassword("Incorrect password");
        }
        System.out.println("Login successful");
    }
}

public class multi_excptn {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username :");
        String username = sc.nextLine();
        System.out.println("Enter password :");
        String password = sc.nextLine();

        testabcd t = new testabcd();

        try {
            t.check(username,password);
        }
        catch(InvalidUserName e) {
            System.out.println(e.getMessage());
        }
        catch(InvalidPassword e) {
            System.out.println(e.getMessage());
        }
    }
}
