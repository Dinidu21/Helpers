package HighEfficient;

public class BinaryInsertionSort {

    public static void binaryInsertionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            // Find the position where key should be inserted
            int insertionIndex = binarySearch(arr, key, 0, i - 1);

            // Shift elements to the right to make room for key
            for (int j = i - 1; j >= insertionIndex; j--) {
                arr[j + 1] = arr[j];
            }

            arr[insertionIndex] = key;
        }
    }
    private static int binarySearch(int[] arr, int key, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {
            65, 101, 77, 17, 189, 21, 5, 41, 9, 193, 
            197, 177, 161, 49, 129, 173, 89, 1, 53, 133
        };

        System.out.println("Original array:");
        printArray(arr);

        binaryInsertionSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}