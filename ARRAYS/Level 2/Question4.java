import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt(), maxDigit = 10, idx = 0;
        int[] digits = new int[maxDigit];

        while(num > 0) {
            if(idx == maxDigit) {
                maxDigit += 10;
                digits = Arrays.copyOf(digits, maxDigit);
            }
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
