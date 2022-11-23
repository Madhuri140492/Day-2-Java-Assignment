package Day2_PracticeProblem.Operator_Programs;

//Write a Java Program to find the roots of the equation a*x*x + b*x + c.

import java.util.Scanner;

public class Quadratic_Roots {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of B : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of C : ");
        double c = sc.nextDouble();
        double root1 = 0;
        double root2 = 0;
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("Roots are imaginary.");
        } else if (d == 0) {
            System.out.println("Roots are equal.");
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
        } else if (d > 0) {
            System.out.println("Roots are unequal.");
            root1 = (-b + Math.sqrt(d)) / (2 * a);
            root2 = (-b - Math.sqrt(d)) / (2 * a);
        }
        System.out.println("Roots of the Quadratic equations are :");
        System.out.println("Root 1 = " + root1 + " & Root 2 = " + root2);
    }
}