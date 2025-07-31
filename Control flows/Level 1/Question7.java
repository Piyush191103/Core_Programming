import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

        // Check if the date is in spring season
        if ((month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
