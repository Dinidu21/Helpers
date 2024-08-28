public class VariableSwap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);

        //another way to swap variables
        a = 5;
        b = 7;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a ^ b;
        System.out.println("a = a ^ b: a = " + a + ", b = " + b);
        b = a ^ b;
        System.out.println("b = a ^ b: a = " + a + ", b = " + b);
        a = a ^ b;
        System.out.println("a = a ^ b: a = " + a + ", b = " + b);
        System.out.println("After swapping: a = " + a + ", b = " + b);

    }
}
