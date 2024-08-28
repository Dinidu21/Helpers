public class removeAllOccurrences {
    public removeAllOccurrences(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }

    //Write a program to remove all occurrences of a given character from a string.
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'o';
        new removeAllOccurrences(str, ch);
    }
}
