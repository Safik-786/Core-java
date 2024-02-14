/*.......................CREATE A SUBLIST FROM ARRAY LIST.......................
sublist() method of ArrayList class is used to create a sub list from a given array List
example:  arr1.subList(int fromindex,int toindex)
* here fromindex is inclusive and toindex is exclusive*/

import java.util.ArrayList;

public class jc_04_sublist
{
    public static void main(String[] args)
    {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("h");
        alist.add("a");
        alist.add("b");
        alist.add("i");
        alist.add("b");
        alist.add("i");
        System.out.println(alist);
        ArrayList<String> al = new ArrayList<>(alist.subList(1,4));
        System.out.println("sub array list is: "+al);
    }
//  similarly we can perform sublist in intiger
}
