import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("The number " + n + " is not a natural number.");
            return;
        }

        int sum = 0, i = 1;
        while (i <= n) sum += i++;

        int formulaSum = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println(sum == formulaSum ? "Both results match." : "Results do not match.");
    }
}
