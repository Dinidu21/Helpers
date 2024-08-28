package HighEfficient;

import java.util.HashMap; 

public class TwoSum2DHashMap {

    // Function to find two items in a 2D array where the sum of the prices equals the target using HashMap
    public static int[][] twoSum2D(int[][] items, int target) {
        HashMap<Integer, Integer> priceMap = new HashMap<>();  // {price: rowIndex}

        for (int i = 0; i < items.length; i++) {
            int price = items[i][1];  // Extracting price from the second column
            int complement = target - price;

            // Check if the complement price is already in the map
            if (priceMap.containsKey(complement)) {
                return new int[][] { items[priceMap.get(complement)], items[i] };  // Return the two rows
            }

            // Store the current price and row index in the HashMap
            priceMap.put(price, i);
        }

        return new int[][] {};  // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        int[][] items = {
            { 101, 10 },  // {Item ID, Price}
            { 102, 20 },
            { 103, 30 },
            { 104, 40 },
            { 105, 50 }
        };
        int target = 70;

        int[][] result = twoSum2D(items, target);

        if (result.length > 0) {
            System.out.println("Items found:");
            System.out.println("Item ID: " + result[0][0] + ", Price: " + result[0][1]);
            System.out.println("Item ID: " + result[1][0] + ", Price: " + result[1][1]);
        } else {
            System.out.println("No two items found with prices adding up to the target.");
        }
    }
}
