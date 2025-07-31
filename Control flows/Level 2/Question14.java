import java.util.*;
class Question14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), p = sc.nextInt(), res = 1, i = 0;
    while (i < p) {
      res *= n;
      i++;
    }
    System.out.println("Power: " + res);
  }
}
