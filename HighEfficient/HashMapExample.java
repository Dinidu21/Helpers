package HighEfficient;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap with String keys and Integer values
        HashMap<String, Integer> itemPrices = new HashMap<>();

        // Adding key-value pairs to the HashMap
        itemPrices.put("Apple", 100);
        itemPrices.put("Banana", 30);
        itemPrices.put("Orange", 50);

        // Retrieving a value using a key
        System.out.println("Price of Apple: " + itemPrices.get("Apple"));  // Output: Price of Apple: 100

        // Checking if a key exists
        if (itemPrices.containsKey("Banana")) {
            System.out.println("Price of Banana: " + itemPrices.get("Banana"));  // Output: Price of Banana: 30
        }

        // Removing a key-value pair
        itemPrices.remove("Orange");

        // Iterating over the HashMap
        for (String key : itemPrices.keySet()) {
            System.out.println("Item: " + key + ", Price: " + itemPrices.get(key));
        }

        // Output:
        // Item: Apple, Price: 100
        // Item: Banana, Price: 30
    }
}
