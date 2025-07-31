import java.util.*;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter marks in Phy, Chem, Math: ");
            phy[i] = sc.nextInt(); chem[i] = sc.nextInt(); math[i] = sc.nextInt();
            if(phy[i]<0 || chem[i]<0 || math[i]<0) { i--; continue; }
            percent[i] = (phy[i]+chem[i]+math[i])/3.0;
            grade[i] = percent[i]>=80?'A':percent[i]>=70?'B':percent[i]>=60?'C':percent[i]>=50?'D':percent[i]>=40?'E':'R';
        }

        for(int i=0; i<n; i++)
            System.out.println("Marks: " + phy[i]+", "+chem[i]+", "+math[i]+" %: "+percent[i]+" Grade: "+grade[i]);
    }
}

