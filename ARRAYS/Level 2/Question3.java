import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] digits = new int[10];
        int idx = 0;
        while(num > 0 && idx < 10) {
            digits[idx++] = num % 10;
            num /= 10;
        }

        int max = 0, sec = 0;
        for(int i=0; i<idx; i++) {
            if(digits[i] > max) {
                sec = max;
                max = digits[i];
            } else if(digits[i] > sec && digits[i] != max) {
                sec = digits[i];
            }
        }

        System.out.println("Largest: " + max);
        System.out.println("Second Largest: " + sec);
    }
}
