class student
{
    int roll;
    String name ;
    static String college ="GITAM";
    student(int r,String n)
    {
        roll=r;
        name=n;
    }
    void display()
    {
        System.out.println(roll+" "+name+" "+college);
    }
}
public class static_var
{
    public static void main(String[] args)
    {
        student r = new student(55, "safik");
        r.display();
        student r2 = new student(56, "rahul");
        r2.display();
    }
}





//class b
//{
//
//    int safik =53;
//    static int ram=50;
//
//}
//class saffix
//{
//    public static void main(String[] args)
//    {
//        System.out.println(b.ram);
//        r=new b();
//        System.out.println(r.safik);
//    }
//}



