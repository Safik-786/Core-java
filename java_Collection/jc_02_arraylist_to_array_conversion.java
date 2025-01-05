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
        ArrayList<Integer> al= new ArrayList<Integer>();
        al.add(22);
        al.add(23);
        al.add(24);
        al.add(26);
        al.add(27);
        Integer[] array = al.toArray(new Integer[al.size()]);
        System.out.println(Arrays.toString(array));


    }

}
