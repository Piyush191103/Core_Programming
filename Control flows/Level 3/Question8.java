import java.util.*;
class Question8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(), sum = 0, temp = n;
    while (temp > 0) {
      sum += temp % 10;
      temp /= 10;
    }
    System.out.println(n % sum == 0 ? "Harshad" : "Not Harshad");
  }
}

