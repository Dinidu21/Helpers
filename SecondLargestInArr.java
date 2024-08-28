public class SecondLargestInArr {
    //Write a program to find the second largest element in an array.
    public static void main(String[] args) {
        int[] arr = {7, 20,68, 30, 40, 59, 47, 69, 54};
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Second largest element is " + secondLargest);
    }
}
