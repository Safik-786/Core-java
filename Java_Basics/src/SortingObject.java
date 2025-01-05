import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Collections;
class Student{
    String name;
    int mark;
    Student(String name, int mark){
        this.name = name;
        this.mark = mark;
    }
}
public class SortingObject
{
    public static void main(String[] args) {
        ArrayList <Student> students= new ArrayList<>();
        students.add(new Student("Safik", 88));
        students.add(new Student("Aadi", 67));
        students.add(new Student("Ali", 65));
        students.add(new Student("Rehan", 99));
        students.add(new Student("john", 34));

//        Ascending Order
//        Collections.sort(students, (obj1, obj2) -> obj1.mark - obj2.mark);


//        Descending Order
        Collections.sort(students, (obj1, obj2) -> obj2.mark - obj1.mark);
        for (Student stu : students){
            System.out.println(stu.name+" "+ stu.mark);
        }
    }

}
