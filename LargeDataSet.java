
class LargeDataSet {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

public static void main(String[] args) {
        int[] arr = { 
            1, 5, 9, 13, 17, 21, 25, 29, 33, 37, 
            41, 45, 49, 53, 57, 61, 65, 69, 73, 77, 
            81, 85, 89, 93, 97, 101, 105, 109, 113, 117, 
            121, 125, 129, 133, 137, 141, 145, 149, 153, 157, 
            161, 165, 169, 173, 177, 181, 185, 189, 193, 197 
        };
        System.err.println("Before Sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println("\nAfter Sorting: ");
        insertionSort(arr);
    }
}
