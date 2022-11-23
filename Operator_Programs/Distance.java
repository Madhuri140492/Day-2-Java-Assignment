package Day2_PracticeProblem.Operator_Programs;

//Write a Java Program that takes two integer command-line arguments x and y and
// prints the Euclidean distance from the point (x, y) to the origin (0, 0).
// The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {

        System.out.print("Enter the value of X : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = sc.nextInt();
        double d = Math.sqrt(x * x + y * y);
        System.out.println("The total distance is : " + d);
    }
}
