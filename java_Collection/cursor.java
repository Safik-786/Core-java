import java.util.*;

public class cursor {
    public static void main(String[] args) {
        List arr = new LinkedList();
        arr.add("rahul");
        arr.add(43);
        arr.add("safik");
        arr.add(543);
        Iterator it = arr.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
