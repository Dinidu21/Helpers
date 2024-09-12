import java.util.Scanner;

public class CoinGame3222 {
    public static String losingPlayer(int x, int y) {
        return (Math.min(x,y/4) % 2 == 0) ? "Bob" :"Alice";
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String name = losingPlayer(x,y);
        System.out.println(name);

    }
}
