import java.util.*;
public class jc_02_arraylist_to_array_conversion
{
    public static void main(String[] args)
    {
        //    ARRAY LIST TO ARRAY  using  " toArray " method
        ArrayList<String> alist = new ArrayList<String>();
        alist.add("a");
        alist.add("b");
        alist.add("c");
        alist.add("d");
        System.out.println("array list is "+alist);
        String [] arr= new String[alist.size()];

        alist.toArray(arr);

        System.out.println("array:");
        for (String str: arr)
        {
            System.out.print(str+"  ");
        }
        System.out.println("\narray length is "+ arr.length);
    }

}
