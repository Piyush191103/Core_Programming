public class Question6 {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]), d = Integer.parseInt(args[1]);
        System.out.println(isSpring(m, d) ? "Its a Spring Season" : "Not a Spring Season");
    }
    static boolean isSpring(int m, int d) {
        return (m == 3 && d >= 20) || (m == 6 && d <= 20) || (m > 3 && m < 6);
    }
}

