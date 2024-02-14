import java.util.ArrayList;
import java.util.Arrays;

public class jc_02_array_to_arraylist_conversion
{
//        ARRAY TO ARRAYLIST conversion using   " asList() " method of Array class
    public static void main(String[] args)
    {
        String []arr= {"a","b","c"};
        for (String s: arr)
        {
            System.out.print(s+"  ");
        }
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(arr));
        System.out.println("\narray list is :"+alist);
    }
}
