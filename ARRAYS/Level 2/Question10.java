import java.util.*;
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int[] freq = new int[10];
        while(num > 0) {
            freq[num % 10]++;
            num /= 10;
        }
        for(int i=0; i<10; i++)
            if(freq[i] > 0)
                System.out.println("Digit " + i + " => " + freq[i] + " times");
    }
}
