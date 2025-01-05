import java.util.ArrayList;
import java.util.Collections;

public class jc_05_Swap
{
    public static void main(String[] args)
    {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("h");
        alist.add("a");
        alist.add("b");
        alist.add("i");
        alist.add("b");
        Collections.swap(alist,1,3);
        System.out.println(alist);


//        to determine index of the element
        System.out.println(alist.indexOf("i"));
    }
}
