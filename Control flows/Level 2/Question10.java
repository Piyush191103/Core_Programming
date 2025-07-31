import java.util.*;
class Question10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), g = 1, i = n - 1;
    while (i >= 1) {
      if (n % i == 0) {
        g = i;
        break;
      }
      i--;
    }
    System.out.println("Greatest Factor: " + g);
  }
}
