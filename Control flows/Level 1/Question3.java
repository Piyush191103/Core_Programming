import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("Is the first number the largest? " + (num1 > num2 && num1 > num3 ? "Yes" : "No"));
        System.out.println("Is the second number the largest? " + (num2 > num1 && num2 > num3 ? "Yes" : "No"));
        System.out.println("Is the third number the largest? " + (num3 > num1 && num3 > num2 ? "Yes" : "No"));
    }
}
