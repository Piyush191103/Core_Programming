import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        double rounds = findRounds(a, b, c);
        System.out.println("Rounds to complete 5km: " + (int)Math.ceil(rounds));
    }
    static double findRounds(double a, double b, double c) {
        double peri = a + b + c;
        return 5000 / peri;
    }
}
