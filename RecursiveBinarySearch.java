public class RecursiveBinarySearch {

    // Recursive method to perform binary search
    public static int binarySearch(int[] arr, int left, int right, int target) {
        // Base case: If the left index exceeds the right index, the element is not found
        if (left > right) {
            return -1; // Target not found
        }

        // Calculate the middle index
        int mid = left + (right - left) / 2;

        // Check if the target is at the middle
        if (arr[mid] == target) {
            return mid; // Target found at index mid
        }

        // If the target is smaller than the middle element, search in the left half
        if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        }

        // Otherwise, search in the right half
        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72, 91};
        int target = 23;

        // Perform binary search on the entire array
        int result = binarySearch(sortedArray, 0, sortedArray.length - 1, target);

        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
