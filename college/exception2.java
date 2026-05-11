import java.io.FileReader;
import java.io.IOException;

public class exception2 {
    public static void main(String[] args) {
        // FileReader file = new FileReader("abc.txt");   // Will give error.
        try {
            @SuppressWarnings({ "resource", "unused" })
            FileReader file = new FileReader("abc.txt");
            System.out.println("File Opened Successfully");
        }
        catch(IOException e) {
            System.out.println("File not found");
        }
    }
}
