package multithreading;

class Task extends Thread{
    @Override
    public void run() {
        System.out.println("this is task");
    }
}
public class mt_1
{
    public static void main(String[] args) {
        Task t1 =new Task();
        t1.start();
        Task t2 =new Task();
        t2.start();
        Task t3 =new Task();
        t3.start();
        Task t4 =new Task();
        t4.start();


    }
}
