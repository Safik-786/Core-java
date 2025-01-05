import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;


public class jc_01_ArrayList
{
    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(23);
        al.add("trd");
//        System.out.println(al);
        Iterator it =al.iterator();             //  ITERATOR
        while (it.hasNext()){
            System.out.print(it.next() +" ");
        }
        System.out.println();
        LinkedList name = new LinkedList();
        name.add("rahul");
        name.add(6546);
        name.add("2422");
//        System.out.println(name);
        ListIterator lit = name.listIterator();     //  ListIterator
        while (lit.hasNext()){
            System.out.print(lit.next() +" ");
        }

    }
}
