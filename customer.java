class bus implements Runnable
{
    int available=1, passenger;


    bus( int passenger)
    {
        this.passenger=passenger;
    }
    public synchronized  void run()
    {
        String name= Thread.currentThread().getName();
        if (available>=passenger)
        {
            System.out.println(name+" Reserved");
            available=available-passenger;
        }
        else
        {
            System.out.println(" seat are not available!");
        }
    }
}
class customer
{
    public static void main(String[] args)
    {
        bus obj = new bus(1);
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);
        Thread t3 = new Thread(obj);

        t1.setName("ravi");
        t2.setName("rahul");
        t3.setName("ram");

        t1.start();
        t2.start();
        t3.start();


    }
}

