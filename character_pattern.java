
import java.util.Scanner;
public class character_pattern
{
    public static void main(String args[])
    {
        char ch,i,j,count='A';
        Scanner r=new Scanner(System.in);
        System.out.println("enter any char upto you want to make pattern:");
        ch=r.next().charAt(0);
        for (i='A';i<=ch;i++)
        {
            for (j='A';j<=i;j++)
            {
                System.out.print(count +" ");
                count++;
            }
            System.out.print("\n");
        }
    }
}
