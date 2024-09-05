public class MissingNumberArr {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};

        int tot = numbers.length+1;

        int expecSum = tot  *(tot + 1) /2;
        //n*(n+1)/2
        int num_sum = 0;

        for (int n : numbers){
            num_sum += n;
        }

        System.out.println("Missing Number is : "+(expecSum-num_sum));

    }
}
