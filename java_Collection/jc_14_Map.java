import java.util.*;

public class jc_14_Map
{
    public static void main(String[] args) {
        // Create a Map instance
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Retrieve a value
        int value = map.get("Two");
        System.out.println("Value for key 'Two': " + value);

        // Check if a key exists
        boolean hasKey = map.containsKey("One");
        System.out.println("Map contains key 'One': " + hasKey);

        // Check if a value exists
        boolean hasValue = map.containsValue(3);
        System.out.println("Map contains value 3: " + hasValue);

        // Iterate over the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Remove a key-value pair
        map.remove("Three");

        // Check the size of the map
        int size = map.size();
        System.out.println("Size of the map: " + size);

        // Clear the map
        map.clear();
        System.out.println("Map is empty: " + map.isEmpty());
    }
}
