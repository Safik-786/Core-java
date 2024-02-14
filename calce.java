import java.util.Scanner;
public class calce
{
    public static void main(String[] args)
    {
        int ch,m,n;
        Scanner r =new Scanner(System.in);
        System.out.println("click :1  for Addition");
        System.out.println("click :2  for subtraction");
        System.out.println("click :3  for multiplication");
        System.out.println("click :4  for division");
        System.out.println("click :5  for remainder");

        System.out.println("enter operator:");
        ch=r.nextInt();
        System.out.println("enter first intiger:");
        m=r.nextInt();
        System.out.println("enter second intiger:");
        n=r.nextInt();
        switch (ch)
        {
            case 1: System.out.println("sum+"+(m+n));
                break;
            case 2: System.out.println("difference ="+(m-n));
                break;
            case 3: System.out.println("multiplication ="+(m*n));
                break;
            case 4: System.out.println("division ="+(m/n));
                break;
            case 5: System.out.println("remainder ="+(m%n));
                break;
            default:
                System.out.println("enter valid operator");
        }
    }
}

/*
import java.util.Scanner;
import java.lang.System;

public class fuck {
    public static void main(String[] args) {
        while (true) {
            System.out.println("click 1 for addition");
            System.out.println("click 2 for subtraction");
            System.out.println("click 3 for multiplication");
            System.out.println("click 4 for division");
            System.out.println("click 5 for remainder");
            System.out.println("click 5 for exit !");
            Scanner s = new Scanner(System.in);
            System.out.println("enter your choice(operator):");
            int no = s.nextInt();
            if (no==5)
            {
                System.exit(1);
            }
            System.out.println("enter 1st operand");
            int a = s.nextInt();
            System.out.println("enter 2nd operand");
            int b = s.nextInt();
            switch (no) {
                case 1:
                    System.out.println("sum of 2 number is " + a + b);
                    break;
                case 2:
                    System.out.println("dif of 2 number is " + (a - b));
                    break;
                case 3:
                    System.out.println("div of 2 number is " + a * b);
                    break;
                case 4:
                    System.out.println("div of 2 number is " + a / b);
                    break;
                case 5:
                    System.out.println("rem of 2 number is " + a % b);
                    break;
                case 6:
                    System.exit(0);


            }
        }
    }
}

 */

   