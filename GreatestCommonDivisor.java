public class GreatestCommonDivisor {
    //Write a program to find the GCD (Greatest Common Divisor) of two numbers using Euclid's algorithm.
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        System.out.println("GCD of " + num1 + " and " + num2 + " is " + gcd(num1, num2));


    }

    private static int gcd(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        return gcd(num2, num1 % num2);
    }
}
