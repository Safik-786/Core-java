package Exception_tut;

import java.util.Scanner;
class InvalidMarkException extends Exception
{
    InvalidMarkException(String msg)
    {
        System.out.println(msg);
    }
}
public class UserDefinedException2
{   int mark;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your mark(out of 100):");
        try
        {
            UserDefinedException2 u= new UserDefinedException2();
            u.mark =s.nextInt();
            marking(u.mark);
        }
        catch (Exception e)
        {
            System.out.println(e);

        }
    }
    static void marking(int mark)throws InvalidMarkException
    {
        if(mark>100)
        {
            throw new InvalidMarkException("mark can't exceed 100");
        }
        else{
            System.out.println("you are secure "+mark+" mark");
        }
    }
}
