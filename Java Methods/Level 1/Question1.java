import java.util.*;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double si = calcSI(p, r, t);
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate " + r + " and Time " + t);
    }
    static double calcSI(double p, double r, double t) {
        return (p * r * t) / 100;
    }
}
