import java.util.PriorityQueue;

public class jc_10_p_Queue
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> q= new PriorityQueue<>();
        q.add(5);
        q.add(3);
        q.add(1);
        q.add(6);
        q.add(2);
        q.add(4);

        System.out.println("p-queue= "+q);
        System.out.println("here peek element= "+q.peek());
        q.remove();
        q.remove();
        q.remove();
        System.out.println("queue after removal" +q);
        System.out.println(q.peek());
        int i= q.poll();
        System.out.println("poll  ="+i);
        System.out.println("p-queue= "+q);
    }
}
