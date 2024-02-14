
//          ___SubList___
import java.util.LinkedList;
import java.util.List;

public class jc_09_search_LL
{
    public static void main(String[] args) {

        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(3);
        ll.add(5);
        ll.add(7);
        ll.add(9);
        ll.add(5);
        ll.add(6);
        System.out.println(ll);
        for (int t : ll)
        {
            System.out.print(t+"  ");

        }
        System.out.println("\n index of 5 is:  "+ll.indexOf(5));
        System.out.println(" index of 50 is:  "+ll.indexOf(50));
        System.out.println("index of 5 is:  "+ll.lastIndexOf(5));

        System.out.println("is 60 contain in LL  :"+ll.contains(60));
//                              ____OR____
        if (ll.contains(6))
        {
            System.out.println("6 found in LL");
        }
        else
        {
            System.out.println("6 does't found!");
        }
        List sublist = ll.subList(1,4);
        System.out.println("sublist= "+sublist);

        sublist.add(0,100);

        System.out.println("after changes LL: "+ll);
    }
}
