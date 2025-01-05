
/**
 * InnerDemo4
 */
 class Student {
    String name;
    int roll;
    static String school="Gitam";
    Student(String name, int roll){
        this.name= name;
        this.roll= roll;
    }

    public void display(){
        System.out.println("Name:"+ this.name);
        System.out.println("Roll No:"+ this.roll);
        System.out.println("Collage"+ school);
    }
    
}
public class Demo4 {

    public static void main(String[] args) {
        Student s1= new Student("Safik", 1);
        s1.display();
        Student s2= new Student("Rahul", 2);
        s2.display();
        Student s3= new Student("Rijuan", 4);
        s3.display();
    }
}
