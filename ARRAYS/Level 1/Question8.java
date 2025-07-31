import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt(), max = 10, index = 0;
        int[] factors = new int[max];
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (index == max) {
                    max *= 2;
                    int[] temp = new int[max];
                    System.arraycopy(factors, 0, temp, 0, index);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        System.out.println("Factors of " + n + ":");
        for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");
    }
}
