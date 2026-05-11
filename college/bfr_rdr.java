import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class bfr_rdr {
    public static void main(String[] args)  throws IOException    
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter name :");
        String name = br.readLine();

        System.out.print("Enter age :");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter height :");
        int height = Integer.parseInt(br.readLine());

        System.out.println("Name is :"+name);
        System.out.println("Age is :"+age);
        System.out.println("Height is :"+height);
    }
}
