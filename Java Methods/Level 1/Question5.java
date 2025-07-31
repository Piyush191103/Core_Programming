import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(check(n));
    }
    static int check(int n) {
        return n > 0 ? 1 : n < 0 ? -1 : 0;
    }
}
