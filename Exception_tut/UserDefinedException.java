package Exception_tut;

import java.util.Scanner;
class InvalidAgeException extends Exception
{
    InvalidAgeException( String msg)
    {
        System.out.println(msg);
//        or we can write       super(msg);
    }
}
public class UserDefinedException
{
    static int age;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your age:");
        try
        {
            age = s.nextInt();
            vote(age);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
        static void vote(int age) throws InvalidAgeException  // it throws exception to the
        // caller method where Exception handle taken place
        //  we can put whole if else block inside the try catch block instead of throwing Exception.

        {
            if (age < 18)
            {
                throw new InvalidAgeException("You are not eligible for voting");
//              here we were created user defined exception object using throw keyword
            }
            else
            {
                System.out.println("you are eligible for voting");
            }
        }
}

