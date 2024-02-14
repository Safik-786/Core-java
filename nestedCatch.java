public class nestedCatch
{
    public static void main(String[] args)
    {
        try
        {
            System.out.println(10/0);
        }
        catch (Exception e)
        {
            System.out.println("arithmatic error");
            try
            {
                String a=null;
                System.out.println(a.toUpperCase());
            }
            catch (NullPointerException x)
            {
                System.out.println("null cant be converted.....!");
            }
        }
        System.out.println("main method ended....!");
    }
}
