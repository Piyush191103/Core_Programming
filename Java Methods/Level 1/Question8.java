import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int[] res = findMinMax(a, b, c);
        System.out.println("Smallest: " + res[0] + ", Largest: " + res[1]);
    }
    static int[] findMinMax(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        return new int[]{min, max};
    }
}
