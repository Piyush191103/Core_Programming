import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(), sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.println("Sum = " + sum);
    }
}

