import java.util.*;

public class jc_11_2_hashmap2
{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 5);
        map.put("Banana", 2);

        // Key exists
        int appleCount = map.getOrDefault("Apple", 0);
        System.out.println("Apple: " + appleCount); // Output: Apple: 5

        // Key does not exist
        int mangoCount = map.getOrDefault("Mango", 0);
        System.out.println("Mango: " + mangoCount); // Output: Mango: 0




        HashMap<Integer, Integer> map2= new HashMap();
        int[] arr = {4, 5, 6, 4, 3, 6, 7, 5, 4};
//        Number Frequency Formula
        for (int num : arr) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
//        System.out.println(map2);

    }
}
