import java.io.*;
class Demo
{
    public static void main(String[] args)throws IOException
    {
        String a,b,c;
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name:");
        a = br.readLine();
       // System.out.println("enter second intiger");
        //b = Integer.parseInt(br.readLine());
        //c=a+b;
        System.out.println("your name is "+a);

    }
}