import java.util.*;
public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter Phy, Chem, Math: ");
            for(int j=0; j<3; j++) {
                marks[i][j] = sc.nextInt();
                if(marks[i][j]<0) { j--; }
            }
            percent[i] = (marks[i][0]+marks[i][1]+marks[i][2])/3.0;
            grade[i] = percent[i]>=80?'A':percent[i]>=70?'B':percent[i]>=60?'C':percent[i]>=50?'D':percent[i]>=40?'E':'R';
        }

        for(int i=0; i<n; i++)
            System.out.println("Marks: "+marks[i][0]+","+marks[i][1]+","+marks[i][2]+" %: "+percent[i]+" Grade: "+grade[i]);
    }
}
