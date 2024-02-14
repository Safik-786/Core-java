import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class cursor2
{
    public static void main(String[] args) {
        List a = new LinkedList();
        a.add("gudu");
        a.add(675);
        a.add("gudi");
        a.add(67);
        ListIterator lit = a.listIterator();     //  ListIterator
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
        System.out.println("=====================================");
/*      to use previous() method we need to move the cursor to the end of the list so we have 2 way either
        use next(),hasnext() method before previous, has previous method to move the cursor to the end
        or use obj.next() (no. of element in list) times
 */

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
//        lit.add("hgh");
        lit.set("786");            // it used after commentind add() mrthod and it will replace the "last" element with 786
//        lit.remove();             // it remove last element of this list

        System.out.println(a );

    }
}
