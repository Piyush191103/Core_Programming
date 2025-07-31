import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double sum = 0;
        int i = 0;
        while (true) {
            System.out.print("Enter number: ");
            double val = sc.nextDouble();
            if (val <= 0 || i == 10) break;
            nums[i++] = val;
        }
        for (int j = 0; j < i; j++) {
            System.out.println("Number: " + nums[j]);
            sum += nums[j];
        }
        System.out.println("Sum = " + sum);
    }
}

