import java.util.*;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        String[] name = {"Amar", "Akbar", "Anthony"};
        for(int i=0; i<3; i++) {
            System.out.print("Enter age & height of " + name[i] + ": ");
            age[i] = sc.nextInt(); height[i] = sc.nextDouble();
        }

        int minAge = 0, maxHt = 0;
        for(int i=1; i<3; i++) {
            if(age[i] < age[minAge]) minAge = i;
            if(height[i] > height[maxHt]) maxHt = i;
        }

        System.out.println("Youngest: " + name[minAge]);
        System.out.println("Tallest: " + name[maxHt]);
    }
}
