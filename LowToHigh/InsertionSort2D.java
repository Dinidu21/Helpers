package LowToHigh;
public class InsertionSort2D {

    // Function to perform insertion sort on a 2D array based on the scores (3rd column)
    public static void insertionSort2D(int[][] records) {
        int n = records.length;

        for (int i = 1; i < n; i++) {
            int[] key = records[i];
            int j = i - 1;

            // Move elements of records[0..i-1], that are greater than key's score, to one position ahead of their current position
            while (j >= 0 && records[j][2] > key[2]) {
                records[j + 1] = records[j];
                j--;
            }
            records[j + 1] = key;
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
        insertionSort2D(studentRecords);

        // Print the sorted records
        System.out.println("Sorted student records by score:");
        for (int[] record : studentRecords) {
            System.out.println("ID: " + record[0] + ", Name: " + record[1] + ", Score: " + record[2]);
        }
    }
}
