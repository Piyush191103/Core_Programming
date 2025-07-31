import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        for (int n : nums) {
            if (n > 0) System.out.println(n + " is positive and " + (n % 2 == 0 ? "even" : "odd"));
            else if (n < 0) System.out.println(n + " is negative");
            else System.out.println("Zero");
        }
        if (nums[0] == nums[4]) System.out.println("First and last elements are equal");
        else if (nums[0] > nums[4]) System.out.println("First element is greater");
        else System.out.println("Last element is greater");
    }
}
