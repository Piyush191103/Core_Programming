import java.util.*;
class Question1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); {
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++)
          System.out.println(i + " is " + (i % 2 == 0 ? "Even" : "Odd"));
    }
  }
}

