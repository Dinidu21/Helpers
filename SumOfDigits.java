public class SumOfDigits {
    //Write a program to find the sum of digits of a given number.
    public static void main(String[] args) {
        int num = 5469;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("Sum of digits is " + sum);
    }
}
