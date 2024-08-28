public class TwoSum2D {

    // Function to find two rows in a 2D array where the sum of the second column equals the target
    public static int[][] twoSum2D(int[][] items, int target) {
        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i][1] + items[j][1] == target) {
                    return new int[][] { items[i], items[j] };  // Return the rows of the two items
                }
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
