import java.util.*;
class Question4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean isPrime = n > 1;
    for (int i = 2; i <= n / 2; i++)
      if (n % i == 0) { isPrime = false; break; }
    System.out.println(isPrime ? "Prime" : "Not Prime");
  }
}

