import java.util.ArrayList;
public class largest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(4);

        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++) {
            if (max<list.get(i)) {
                max = list.get(i);
            }

            // max = Math.max(max,list.get(i));   [Instead of if codition.]
        }
        System.out.println("Max Element is :"+max);
    }
}
