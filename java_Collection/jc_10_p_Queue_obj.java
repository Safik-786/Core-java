import java.util.Comparator;
import  java.util.PriorityQueue;
public class jc_10_p_Queue_obj
{
    static class Student implements Comparable<Student>{
        String name;
        int mark;
        Student(String name, int mark){
            this.mark = mark;
            this.name = name;
        }
        @Override
        public int compareTo(Student stud) {
            return this.mark- stud.mark;
        }
    }

    public static void main(String[] args) {
//        PriorityQueue<Student> que= new PriorityQueue<Student>();
        PriorityQueue<Student> que= new PriorityQueue<Student>(Comparator.reverseOrder());
        que.add(new Student("Safik", 98));
        que.add(new Student("Rahuk", 56));
        que.add(new Student("Rijuan", 99));
        que.add(new Student("Ali", 76));
        que.add(new Student("Akbar", 84));
        que.add(new Student("Nijam", 48));
        System.out.println("Success");

        while (!que.isEmpty()){
            System.out.println(que.peek().name+" -> "+que.peek().mark);
            que.remove();
        }
    }
}
