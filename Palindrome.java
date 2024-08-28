public class Palindrome {
    public static void main(String[] args) {

        String str = "madam";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //Write a program to check if a number is a palindrome.
        int num = 123;
        int temp = num;
        int reverseNum = 0;
        while (temp != 0) {
            reverseNum = reverseNum * 10 + temp % 10;
            temp = temp / 10;
        }
        if (num == reverseNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


    }
}
