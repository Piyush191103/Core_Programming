import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Max Handshakes: " + handshakes(n));
    }
    static int handshakes(int n) {
        return n * (n - 1) / 2;
    }
}
