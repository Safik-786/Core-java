import java.util.ArrayList;

public class jc_02_arraylistt_to_String_conversion
{
    public static void main(String[] args)
    {
//        arraylist to string conversion using  " toString " mwthod
        ArrayList<String> alist =new ArrayList<>();
        alist.add("f");
        alist.add("h");
        alist.add("u");
        alist.add("x");
        alist.add("m");
        System.out.println("arraylist:"+alist);
        String str = alist.toString();
        System.out.println("String version is"+str);
        System.out.println("size of array list is "+alist.size());
        System.out.println(" size of string is "+str.length());
    }
}

