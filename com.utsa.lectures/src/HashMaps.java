/**
 *          HashMaps
 *
 *          This class is a collection of methods that demonstrate the use of HashMaps in Java.
 *
 */

// Import the HashMap class from the java.util package
import java.util.HashMap;

public class HashMaps {

    public static void main(String[] args) {

        // Create a new HashMap.  Notice that we specify the data types for the key and value, meaning they do not
        // have to be the same data type.
        HashMap<String, Integer> map = new HashMap<String, Integer>(); // Key: String, Value: Integer

        // Add key-value pairs to the HashMap
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("David", 40);

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Get the value for a specific key
        System.out.println("Value for key 'Alice': " + map.get("Alice"));

        // Check if the HashMap contains a specific key
        System.out.println("Contains key 'Bob': " + map.containsKey("Bob"));

        // Check if the HashMap contains a specific value
        System.out.println("Contains value 35: " + map.containsValue(35));

        // Remove a key-value pair from the HashMap
        map.remove("Charlie");

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Get the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // Check if the HashMap is empty
        System.out.println("Is HashMap empty: " + map.isEmpty());

        // Clear the HashMap
        map.clear();

        // Print the HashMap
        System.out.println("HashMap: " + map);

        // Check if the HashMap is empty
        System.out.println("Is HashMap empty: " + map.isEmpty());
    }
}
