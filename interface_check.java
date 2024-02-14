import java.util.Scanner;
interface client_chinkan
{
    void star_pyramid();
}
interface client_harash extends client_chinkan
{
    void hash_pyramid();
}

class check implements client_harash
{
    public void star_pyramid()
    {
        int i,j,z,n;
        Scanner r=new Scanner(System.in);
        System.out.println("enter no of row of pyramid:");
        n=r.nextInt();
        for (i=0;i<n;i++)
        {
            for (j=n-1;j>i;j--)
            {
                System.out.print(" ");
            }
            for (z=0;z<=i;z++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }

    @Override
    public void hash_pyramid()
    {
            int i,j,k,n;
            Scanner r=new Scanner(System.in);
            System.out.println("enter no of row of pyramid:");
            n=r.nextInt();
            for (i=0;i<n;i++)
            {
                for (j=n-1;j>i;j--)
                {
                    System.out.print(" ");
                }
                for (k=0; k<=i; k++)
                {
                    System.out.print("# ");
                }
                System.out.print("\n");
            }


    }
}
class interface_check
{
    public static void main(String[] args)
    {
        check ref = new check();
        ref.star_pyramid();
        ref.hash_pyramid();
    }
}