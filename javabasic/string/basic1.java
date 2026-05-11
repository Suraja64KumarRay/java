import java.util.*;
public class basic1 {
    public static void printltrs(String str) {
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
     public static void main(String[] args) {
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");
        
        // Strings are immutable

        System.out.println(str2);
        System.out.println(str);
        System.out.println(arr);

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        
        printltrs(name);
     }
}
