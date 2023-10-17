import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the HashMap
        map.put("apple", 3);
        map.put("banana", 2);
        map.put("orange", 4);

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Get the value associated with a key
        int value = map.get("banana");
        System.out.println("Value for key 'banana': " + value);

        // Remove a key-value pair from the HashMap
        map.remove("orange");

        // Print the HashMap again
        System.out.println("HashMap after removal: " + map);

        // Check if the HashMap contains a key
        boolean containsKey = map.containsKey("apple");
        System.out.println("HashMap contains key 'apple': " + containsKey);

        // Check if the HashMap contains a value
        boolean containsValue = map.containsValue(4);
        System.out.println("HashMap contains value 4: " + containsValue);

        // Get the size of the HashMap
        int size = map.size();
        System.out.println("HashMap size: " + size);
    }
}