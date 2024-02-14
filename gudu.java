import java.io.IOException;

public class gudu
{
    public static void main(String[] args)
    {
        try{
            throw new Exception("hello");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("world");
        }
    }
}
