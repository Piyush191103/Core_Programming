import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10], years = new double[10], bonus = new double[10], newSal = new double[10];
        double totalOld = 0, totalNew = 0, totalBonus = 0;

        for(int i=0; i<10; i++) {
            System.out.print("Enter salary & years of service: ");
            double s = sc.nextDouble(), y = sc.nextDouble();
            if(s < 0 || y < 0) { i--; continue; }
            salary[i] = s; years[i] = y;
        }

        for(int i=0; i<10; i++) {
            bonus[i] = (years[i] > 5 ? 0.05 : 0.02) * salary[i];
            newSal[i] = salary[i] + bonus[i];
            totalOld += salary[i]; totalNew += newSal[i]; totalBonus += bonus[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }
}
