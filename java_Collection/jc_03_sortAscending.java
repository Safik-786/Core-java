import java.util.ArrayList;
import java.util.Collections;
public class jc_03_sortAscending
{
    public static void main(String[] args)
    {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("f");
        alist.add("a");
        alist.add("z");
        alist.add("g");
        alist.add("t");
        alist.add("b");
        System.out.println("before sorting:");
        System.out.println(alist);
        Collections.sort(alist);
        System.out.println("after sorting:");
        System.out.println(alist);

        ArrayList<Integer> num = new ArrayList<>();
        num.add(76);
        num.add(21);
        num.add(8);
        num.add(6);
        num.add(85);
        num.add(7);
        System.out.println("before sortimg" + num);
        Collections.sort(num);
        System.out.println("after sorting" + num);
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("after sorting in descending"+num);
    }
}