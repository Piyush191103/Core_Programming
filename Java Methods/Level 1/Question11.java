import java.util.*;
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble(), speed = sc.nextDouble();
        System.out.println("Wind Chill: " + calc(temp, speed));
    }
    static double calc(double t, double v) {
        return 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
    }
}
