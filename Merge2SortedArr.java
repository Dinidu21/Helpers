public class Merge2SortedArr {
    //Write a program to merge two sorted arrays into a single sorted array.
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9,12,15};
        int[] arr2 = {2, 4, 6, 8, 10,20};
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            arr3[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            arr3[k++] = arr2[j++];
        }
        for (int l = 0; l < arr3.length; l++) {
            System.out.print(arr3[l] + " ");
        }
    }
}
