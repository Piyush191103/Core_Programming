import java.util.*;
class Question11 {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int d = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    if (m < 3) { m += 12; y--; }
    int k = y % 100, j = y / 100;
    int h = (d + 13 * (m + 1) / 5 + k + k/4 + j/4 + 5*j) % 7;
    int day = (h + 6) % 7; // Convert to 0=Sunday, ..., 6=Saturday
    System.out.println(day);
  }
}
