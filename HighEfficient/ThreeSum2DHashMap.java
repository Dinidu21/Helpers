package HighEfficient;

import java.util.HashMap;

public class ThreeSum2DHashMap {

    // Function to find three items in a 2D array where the sum of the prices equals the target using HashMap
    public static int[][] threeSum2D(int[][] items, int target) {
        // Iterate over each item to fix one item and then find the remaining two
        for (int i = 0; i < items.length - 2; i++) {
            int currentPrice = items[i][1];
            int newTarget = target - currentPrice;
            HashMap<Integer, Integer> priceMap = new HashMap<>();  // {price: rowIndex}

            // Iterate over the remaining items to find two items that sum up to the newTarget
            for (int j = i + 1; j < items.length; j++) {
                int price = items[j][1];
                int complement = newTarget - price;

                // Check if the complement price is already in the map
                if (priceMap.containsKey(complement)) {
                    return new int[][] { items[i], items[priceMap.get(complement)], items[j] };  // Return the three rows
                }

                // Store the current price and row index in the HashMap
                priceMap.put(price, j);
            }
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
        int target = 100;

        int[][] result = threeSum2D(items, target);

        if (result.length > 0) {
            System.out.println("Items found:");
            System.out.println("Item ID: " + result[0][0] + ", Price: " + result[0][1]);
            System.out.println("Item ID: " + result[1][0] + ", Price: " + result[1][1]);
            System.out.println("Item ID: " + result[2][0] + ", Price: " + result[2][1]);
        } else {
            System.out.println("No three items found with prices adding up to the target.");
        }
    }
}
