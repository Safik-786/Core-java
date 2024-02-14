import java.util.TreeSet;

public class jc_12_treeSet
{
    public static void main(String[] args) {
    TreeSet<Integer> ts = new TreeSet<Integer>();       // here we cant insert string
    ts.add(686);
    ts.add(86);
    ts.add(8);
    ts.add(98);
    ts.remove(8);
        System.out.println(ts);     // o/p in ascending sorted order
        TreeSet  t =new TreeSet();      // here we cant insert intiger
        t.add("amit");
        t.add("deepak");
        t.add("deap");
        t.add("dave");
        t.remove("deap");
//        t.clear();
        System.out.println(t);

    }
}
