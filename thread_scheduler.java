class thread_scheduler extends Thread
{
    public void run()
    {
        String n = Thread.currentThread().getName();
        try {

            for (int i = 0; i < 3; i++) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
class bot
{
    public static void main(String[] args) throws Exception
    {
        thread_scheduler t1= new thread_scheduler();
        thread_scheduler t2= new thread_scheduler();
        thread_scheduler t3= new thread_scheduler();

        t1.setName("safik");
        t2.setName("rahul");
        t3.setName("tukulu");

        t1.start();
        t2.start();
        t3.start();

        String n = Thread.currentThread().getName();
        for (int i=0;i<3;i++)
        {
            System.out.println(n);
        }


    }
}
