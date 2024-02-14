import java.util.Scanner;
class saffix
{
    int n1,n2,sum,dif,mult,div,rem;

    public static void main(String[] args)
    {
        saffix ref =new saffix();
        ref.input();
        ref.processing();
        ref.output();
    }
    void input()
    {
        Scanner r=new Scanner(System.in);
        System.out.println("enter 1st intiger:");
        n1=r.nextInt();
        System.out.println("enter second intiger:");
        n2=r.nextInt();
    }
    void processing()
    {
        sum=n1+n2;
        dif=n1-n2;
        mult=n1*n2;
        div=n1/n2;
        rem=n1%n2;
    }
    void output()
    {
        System.out.println("sum is  "+sum);
        System.out.println("difference is  "+dif);
        System.out.println("multiple is  "+mult);
        System.out.println("division is  "+div);
        System.out.println("remainder is  "+rem);
    }

}
