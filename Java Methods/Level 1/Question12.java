import java.util.*;
public class Question12 {
    public static void main(String[] args) {
        double deg = new Scanner(System.in).nextDouble(), rad = Math.toRadians(deg);
        System.out.println("sin: " + Math.sin(rad));
        System.out.println("cos: " + Math.cos(rad));
        System.out.println("tan: " + Math.tan(rad));
    }
}

