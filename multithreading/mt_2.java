package multithreading;

class task1 extends Thread {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(name);
        }
    }
}
public class mt_2
{
    public static void main(String[] args)
    {
        task1 t = new task1();
        task1 t2 = new task1();
//        t.setName("rahul");
//        t.setName();
//        t2.setName("safik");
//        t2.setName();

        t.start();
        t2.start();

        String name = Thread.currentThread().getName();


        for (int i = 0; i <= 3; i++) {
            System.out.println(name);
        }
    }
}
