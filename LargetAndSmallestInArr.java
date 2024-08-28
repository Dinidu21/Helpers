public class LargetAndSmallestInArr {
    //Write a program to find the largest and smallest elements in an array.
    public static void main(String[] args) {
        int[] arr = {7, 20, 30, 40, 50, 47, 69, 54};
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            } else if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Smallest element is " + smallest);
        System.out.println("Largest element is " + largest);
    }
}
