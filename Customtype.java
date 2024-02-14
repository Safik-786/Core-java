class  employ{
    String name;
    int id;
    String job_name;
    int salary;

    public void printDetails(){
        System.out.println("my name is :"+name);
        System.out.println("my id i:"+id);
        System.out.println("my jobs tyoe is:"+job_name);
    }
    public int getSalary()
    {
        return salary;
    }
}
public class Customtype
{
    public static void main(String[] args) {
        employ harry = new employ();
        employ john = new employ();
        harry.name="haresh kumar";
        harry.id= 15;
        harry.job_name="flutter developer";
        harry.salary=45000;

        harry.printDetails();
        int salary= harry.getSalary();
        System.out.println(salary);

        john.name="john josepf";
        john.id= 16;
        john.job_name= "front end developer";
        john.salary= 56936;

        john.printDetails();
        int salarys= john.getSalary();
        System.out.println(salarys);

    }
}
