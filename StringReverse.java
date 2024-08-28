// Description: Reverse a string.

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(reverse(str));
        System.out.println(reverse2(str));
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverse2(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[length - i - 1];
            chars[length - i - 1] = temp;
        }
        return new String(chars);
    }
}
