import java.util.*;
class Question8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), i = 1;
    while (i <= n) {
      if (n % i == 0) System.out.println(i);
      i++;
    }
  }
}
