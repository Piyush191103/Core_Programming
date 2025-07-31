import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[] weight = new double[n], height = new double[n], bmi = new double[n];
        String[] status = new String[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter weight(kg) & height(m): ");
            weight[i] = sc.nextDouble(); height[i] = sc.nextDouble();
            bmi[i] = weight[i]/(height[i]*height[i]);
            status[i] = bmi[i]<=18.4 ? "Underweight" : bmi[i]<=24.9 ? "Normal" : bmi[i]<=39.9 ? "Overweight" : "Obese";
        }

        for(int i=0; i<n; i++)
            System.out.println("H: " + height[i] + " W: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
    }
}
