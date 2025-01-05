package safik;
import java.util.Scanner;
public class demo
{
    public void show()
    {
        int a,b,c;
        Scanner r = new Scanner(System.in);
        System.out.println("enter 1st intiger:");
        a=r.nextInt();
        System.out.println("enter 2nd intiger:");
        b=r.nextInt();
        c=a+b;
        System.out.println(a+"+" +b+"="+c);
    }
    public static void main(String[] args) {
        char[] c= {'g','f','g','f',' ','f','g','f'};
        String stri= "ejjhf";
        System.out.println(stri.length());
        String str = new String(c);
        System.out.println(str);
        str+="safik";
        System.out.println(str);
    }
}



