class TwoSum1D {

    // Function to find two numbers in a 1D array that add up to the target
    public static int[] twoSum1D(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };  // Return the indices of the two numbers
                }
            }
        }
        return new int[] {};  // Return an empty array if no solution is found
    }

    public static void main(String[] args) {
        int[] prices = { 10, 20, 30, 40, 50 };
        int target = 70;
        
        int[] result = twoSum1D(prices, target);
        
        if (result.length > 0) {
            System.out.println("Indices of items whose prices add up to the target: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No two items found with prices adding up to the target.");
        }
    }
}
