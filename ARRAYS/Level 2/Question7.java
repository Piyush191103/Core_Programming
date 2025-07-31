import java.util.*;
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] data = new double[n][3]; // weight, height, BMI
        String[] status = new String[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter weight(kg) & height(m): ");
            double w = sc.nextDouble(), h = sc.nextDouble();
            if(w <= 0 || h <= 0) { i--; continue; }
            data[i][0] = w; data[i][1] = h;
            data[i][2] = w/(h*h);
            double bmi = data[i][2];
            status[i] = bmi<=18.4 ? "Underweight" : bmi<=24.9 ? "Normal" : bmi<=39.9 ? "Overweight" : "Obese";
        }

        for(int i=0; i<n; i++)
            System.out.println("H: " + data[i][1] + " W: " + data[i][0] + " BMI: " + data[i][2] + " Status: " + status[i]);
    }
}

