public class ThreeSum1D {

    // Function to find three numbers in a 1D array that add up to the target
    public static int[] threeSum1D(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        return new int[] { i, j, k };  // Return the indices of the three numbers
                    }
                }
            }
        }
        return new int[] {};  // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        int[] prices = { 10, 20, 30, 40, 50 };
        int target = 100;

        int[] result = threeSum1D(prices, target);
        
        if (result.length > 0) {
            System.out.println("Indices of items whose prices add up to the target: " + result[0] + ", " + result[1] + " and " + result[2]);
        } else {
            System.out.println("No three items found with prices adding up to the target.");
        }
    }
}
