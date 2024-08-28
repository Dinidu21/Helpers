package LowToHigh;
public class BubbleSort2D {

    // Function to perform bubble sort on a 2D array based on the scores (3rd column)
    public static void bubbleSort2D(int[][] records) {
        int n = records.length;
        boolean swapped;

        // Traverse the array and repeatedly swap adjacent elements if they are in the wrong order
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (records[j][2] > records[j + 1][2]) {
                    // Swap the elements
                    int[] temp = records[j];
                    records[j] = records[j + 1];
                    records[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // Example 2D array: {StudentID, Name (as integer for simplicity), Score}
        int[][] studentRecords = {
            {101, 1, 85},
            {102, 2, 95},
            {103, 3, 75},
            {104, 4, 90},
            {105, 5, 80}
        };

        // Sort the records by score
        bubbleSort2D(studentRecords);

        // Print the sorted records
        System.out.println("Sorted student records by score using Bubble Sort:");
        for (int[] record : studentRecords) {
            System.out.println("ID: " + record[0] + ", Name: " + record[1] + ", Score: " + record[2]);
        }
    }
}
