import java.util.*;
class Question9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), g = 1;
    for (int i = n - 1; i >= 1; i--)
      if (n % i == 0) {
        g = i;
        break;
      }
    System.out.println("Greatest Factor: " + g);
  }
}
