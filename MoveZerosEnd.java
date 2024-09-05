import java.util.Arrays;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        System.out.print("Before Moving All 0 to End :");
        System.out.println(Arrays.toString(arr));

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != count) {
                    arr[count] = arr[i];
                    arr[i] = 0;
                    //System.out.println(Arrays.toString(arr));
                }
                count++;
            }

        }

        System.out.print("After Moving All 0 to  End :");
        System.out.println(Arrays.toString(arr));



    }
}
