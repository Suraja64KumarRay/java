public class first_uppr {
    public static String toUpperCase(String[] args) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i<str.length();i++) {
            if(str.charAt(i) == ' ' && i<str.length()-1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi , i am suraja";
        System.out.println(toUpperCase(str));
    }
}
