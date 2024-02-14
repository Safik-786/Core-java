import java.util.TreeMap;

public class jc_13_TreeMap
{
    public static void main(String[] args) {
    TreeMap tm = new TreeMap();
    tm.put(108, "vhfkjhk");
    tm.put(101, "nbv");
    tm.put(102, "lklll");
    tm.put(104, "trsts");
    tm.put(103, "safol");

    tm.remove(103,"safol");

//        tm.put( "vhfkjhk",108);
//        tm.put( "nbv",76);
//        tm.put( "lklll",676);
//        tm.put( "trsts",87);
//        tm.put( "jgj,",58);

//        tm.clear();

        System.out.println(tm.containsKey(104));
        System.out.println(tm.containsValue("safol"));
        System.out.println(tm.floorEntry(108));    // give floor value only
        System.out.println(tm.ceilingEntry(104));  // it return  ceiling value
        System.out.println(tm.ceilingKey(104));
        System.out.println("First Entry =>"+tm.firstEntry());       //it return proper value
//        System.out.println("last Entry =>"+tm.lastEntry());
        System.out.println(tm.headMap(102));                // it return Sorted map
        System.out.println(tm.higherEntry("higher entry : "+103));
//        System.out.println(tm.lowerEntry(105));
        System.out.println(tm);         // output is in sorting order
//        tm.pollFirstEntry();
//        System.out.println(tm);
//        tm.pollLastEntry();
//        System.out.println(tm);


    }
}
