import java.util.ArrayList;

/*  clone() method returns a shallow copy of a array list. i.e  :
after cloning is done changes made to  original Arraylist doesn't get reflect in the clone list
 */
public class jc_06_cloneMethod
{
    public static void main(String[] args)
    {

        ArrayList<String> l1= new ArrayList<>();
        l1.add("a");
        l1.add("p");
        l1.add("p");
        l1.add("l");
        l1.add("e");

        System.out.println("original list is:"+l1);
        ArrayList<String> l2= (ArrayList<String>) l1.clone();
        System.out.println("clonelist is"+l2);
        l1.add("s");
        System.out.println(l1);
        System.out.println(l2);
    }

}
