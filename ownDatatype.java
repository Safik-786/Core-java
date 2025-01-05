
import  java.util.Scanner;
class Student5
{
    String name,fName ; int age;
    Student5(String name,int age,String fName)
    {
        this.name = name;
        this.age = age;
        this.fName = fName;
    }

}

public class ownDatatype
{
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner( System.in);
        System.out.println("enter no. of student:");
        int num = sc.nextInt();
        Student5 [] stud  = new Student5[num];
        for (int i=0;i<num ;i++)
        {
            System.out.println("information for student"+(i+1));
            System.out.println("enter your name:");
            String name= sc.next();
            System.out.println("enter your age:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("enter your father name:");
            String fName= sc.nextLine();

            Student5 joker = new Student5(name,age,fName);
            stud[i]=joker;
        }

//      print information
        for (int i=0;i<num;i++)
        {
            System.out.println("name:" + stud[i].name);
            System.out.println("age:" + stud[i].age);
            System.out.println("father name:" + stud[i].fName);
        }



    }
}

