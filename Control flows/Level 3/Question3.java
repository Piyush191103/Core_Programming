import java.util.*;
class Question3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p = sc.nextInt(), c = sc.nextInt(), m = sc.nextInt();
    int total = p + c + m;
    double per = total / 3.0;
    System.out.println("Average: " + per);
    if (per >= 90) System.out.println("Grade: A+ Excellent");
    else if (per >= 80) System.out.println("Grade: A Very Good");
    else if (per >= 70) System.out.println("Grade: B+ Good");
    else if (per >= 60) System.out.println("Grade: B Average");
    else if (per >= 50) System.out.println("Grade: C Pass");
    else System.out.println("Grade: F Fail");
  }
}
