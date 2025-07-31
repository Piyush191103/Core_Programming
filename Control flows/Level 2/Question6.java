import java.util.*;
class Question6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a1 = sc.nextInt(), h1 = sc.nextInt();
    int a2 = sc.nextInt(), h2 = sc.nextInt();
    int a3 = sc.nextInt(), h3 = sc.nextInt();

    String youngest = (a1 <= a2 && a1 <= a3) ? "Amar" : (a2 <= a3 ? "Akbar" : "Anthony");
    String tallest = (h1 >= h2 && h1 >= h3) ? "Amar" : (h2 >= h3 ? "Akbar" : "Anthony");

    System.out.println("Youngest: " + youngest);
    System.out.println("Tallest: " + tallest);
  }
}
