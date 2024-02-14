package Exception_tut;

public class exceptionHandling
{
//    public static void main(String[] args)
//    {
//        System.out.println("program start.......!");
//        int a=20,b=0,c;
//        c=a/b;
//        System.out.println(c);
//        System.out.println("program terminated.......!");
//    }
    //above commented program will throw arithmatic exception error...
    public static void main(String[] args)
    {
        System.out.println("program start.......!");
        int a=20,b=0,c;
        try {
            c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }

        System.out.println("program terminated.......!");

    }
}
