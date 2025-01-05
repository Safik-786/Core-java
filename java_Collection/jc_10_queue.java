import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class jc_10_queue
{
    public static void main(String[] args) {
        Queue <Integer> q1 = new LinkedList<>();        //in place of arrayDeque we can use Linked list
//        Queue <Integer> q1 = new LinkedList<>();
        q1.add(43);
        q1.add(87);
        q1.add(49);
        q1.offer(67);
        q1.offer(28);
        q1.offer(32);
        for (int i:q1)
        {
            System.out.print(i+"   ");
        }
        q1.remove();
        q1.remove();
        System.out.println(q1.poll());
        System.out.println("\n"+q1);


        Queue<Integer> q = new LinkedList<>();
        q.add(45);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q);
    }
}
