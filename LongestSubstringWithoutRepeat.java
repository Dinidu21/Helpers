public class LongestSubstringWithoutRepeat {
    //Write a program to find the length of the longest substring without repeating characters in a given string.
    public static void main(String[] args) {
        String str = "abcabcbasdfgasdfgasdfg";
        int n = str.length();
        int res = 0;
        int[] lastIndex = new int[256];
        int i = 0;
        for (int j = 0; j < n; j++) {
            i = Math.max(i, lastIndex[str.charAt(j)]);
            res = Math.max(res, j - i + 1);
            lastIndex[str.charAt(j)] = j + 1;
        }
        System.out.println("Length of the longest substring without repeating characters is " + res);
    }
}
