import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choco = sc.nextInt(), kids = sc.nextInt();
        int[] res = findQR(choco, kids);
        System.out.println("Each child: " + res[0] + ", Remaining: " + res[1]);
    }
    static int[] findQR(int n, int d) {
        return new int[]{n / d, n % d};
    }
}
