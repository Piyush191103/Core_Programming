import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int[] res = new int[4];
        for (int i = 6; i <= 9; i++) {
            res[i - 6] = n * i;
            System.out.println(n + " * " + i + " = " + res[i - 6]);
        }
    }
}
