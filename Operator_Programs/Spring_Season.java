//Write a program SpringSeason.java that takes two int values m and d from the command line and prints true
// if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20), false otherwise.

package Day2_PracticeProblem.Operator_Programs;
import java.util.Scanner;

public class Spring_Season {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int m = sc.nextInt();
        System.out.print("Enter the day: ");
        int d = sc.nextInt();
        if (m == 3 && d >= 20) {
            System.out.println("True");
        } else if (m == 4 && d <= 30) {
            System.out.println("True");
        } else if (m == 5 && d <= 31) {
            System.out.println("True");
        } else if (m == 6 && d <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
