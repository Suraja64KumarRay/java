import java.util.ArrayList;
public class basic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.add(1,19);

        System.out.println(list);

        int element = list.get(2);
        System.out.println(element);

        // list.remove(1);
        // system.out.println(list);

        // list.set(element, null)
        list.set(2, 10);
        System.out.println(list);

        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        System.out.println(list.size());

        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
