import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Check divisibility
            if (number % 5 == 0) {
                System.out.println("Is the number " + number + " divisible by 5? Yes");
            } else {
                System.out.println("Is the number " + number + " divisible by 5? No");
            }
        }
    }
}
