import java.util.*;
class Question7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double wt = sc.nextDouble(), ht = sc.nextDouble() / 100;
    double bmi = wt / (ht * ht);
    System.out.println("BMI: " + bmi);
    if (bmi < 18.5) System.out.println("Underweight");
    else if (bmi < 25) System.out.println("Normal");
    else if (bmi < 30) System.out.println("Overweight");
    else System.out.println("Obese");
  }
}

