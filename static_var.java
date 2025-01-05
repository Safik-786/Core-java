class Student
{
    int roll;
    String name ;
    static String college ="GITAM";
    Student(int r,String n)
    {
        roll=r;
        name=n;
    }
    void display() {
        System.out.println(roll+" "+name+" "+college);
    }
}

public class static_var
{
    public static void main(String[] args)
    {
        Student r = new Student(55, "safik");
        r.display();
        Student r2 = new Student(56, "rahul");
        r2.display();

        System.out.println(Student.college);
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



