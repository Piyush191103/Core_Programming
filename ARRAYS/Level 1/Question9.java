import java.util.Scanner;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int[] arr = new int[r * c];
        int k = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = sc.nextInt();
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[k++] = mat[i][j];
        System.out.println("1D array:");
        for (int i = 0; i < k; i++) System.out.print(arr[i] + " ");
    }
}
