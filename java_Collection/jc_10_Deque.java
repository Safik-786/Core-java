import java.util.ArrayDeque;
import java.util.Deque;

public class jc_10_Deque
{
    public static void main(String[] args) {
        Deque <Integer> d1= new ArrayDeque<>();
        d1.addFirst(5);
        d1.addFirst(10);
        d1.addFirst(15);
        d1.addLast(6);
        d1.addLast(12);
        d1.addLast(14);
        System.out.println(d1);
        d1.removeFirst();
        d1.removeLast();
        System.out.println(d1);
        System.out.println("peek first: "+d1.peekFirst());
        System.out.println("peek last: "+d1.peekLast());
        
    }
}
