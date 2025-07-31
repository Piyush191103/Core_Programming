import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt(), count = 0, temp = num;
        while(temp > 0) { count++; temp /= 10; }

        int[] digits = new int[count], rev = new int[count];
        for(int i=0; i<count; i++) {
            digits[i] = num % 10;
            rev[count-1-i] = digits[i];
            num /= 10;
        }

        System.out.print("Reversed Number: ");
        for(int d : rev) System.out.print(d);
    }
}
