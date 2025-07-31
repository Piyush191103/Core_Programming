import java.util.*;
class Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int y = sc.nextInt();
    if (y < 1582) System.out.println("Invalid Year");
    else if (y % 400 == 0) System.out.println("Leap Year");
    else if (y % 100 == 0) System.out.println("Not a Leap Year");
    else if (y % 4 == 0) System.out.println("Leap Year");
    else System.out.println("Not a Leap Year");
  }
}
