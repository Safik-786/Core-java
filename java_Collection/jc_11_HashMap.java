import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class jc_11_HashMap
{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        put() method is used to input element in Hash Table
//        Hash Maps are un ordered maps that means they are printed in Random fashion

        map.put("India",160);
        map.put("pakistan",60);
        map.put("China",150);
        map.put("USA",40);
        System.out.println(map);
        map.put("USA",50);
        System.out.println(map);
//        Search Operation
        System.out.println(map.containsKey("USA"));
        System.out.println(map.containsKey("indonesia"));

        System.out.println(map.get("USA")+"cr");
        System.out.println(map.get("India")+"cr");

//        traditional way to retrive data from hashmap through for loop

        Set set = map.entrySet();
        System.out.println(set);
        Iterator itr =set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

//        here retrive data through for each loop
//        for (Map.Entry< String,Integer> e : map.entrySet())
//        {
//            System.out.println(e.getKey());
//            System.out.println(e.getValue()+"cr");
//        }
    }
}
