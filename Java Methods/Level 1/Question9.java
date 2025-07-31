import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        int[] res = findQR(n, d);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
    }
    static int[] findQR(int n, int d) {
        return new int[]{n / d, n % d};
    }
}
