import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class jc_11_HashSet
{
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(50);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(4);

        System.out.println(set);            //does'nt follow insertion order
        System.out.println("size of set is "+set.size());

        Set set2 = new HashSet(set);        // or we can use > set.addAll( set); method
        set2.add("safik");
        set2.add("rahuf");
        set2.add("ruok");
        set2.add("kunal");

        System.out.println("set2 = " +set2);

        System.out.println(set.contains(2));
        if(set.contains(1)){
            System.out.println("1 is avail");
        }
        else {
            System.out.println("1 is not available");
        }

        set.remove(2);
        System.out.println("after remove 2 ="+set);

//        iterator
        Iterator it =set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
