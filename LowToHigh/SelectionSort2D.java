package LowToHigh;
public class SelectionSort2D {

    // Function to perform selection sort on a 2D array based on the scores (3rd column)
    public static void selectionSort2D(int[][] records) {
        int n = records.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (records[j][2] < records[minIndex][2]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element of the unsorted part
            int[] temp = records[minIndex];
            records[minIndex] = records[i];
            records[i] = temp;
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
        selectionSort2D(studentRecords);

        // Print the sorted records
        System.out.println("Sorted student records by score using Selection Sort:");
        for (int[] record : studentRecords) {
            System.out.println("ID: " + record[0] + ", Name: " + record[1] + ", Score: " + record[2]);
        }
    }
}
