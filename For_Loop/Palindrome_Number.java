//Write a Java Program to find Palindrome Number



package Day2_PracticeProblem.For_Loop;

import java.util.Scanner;
public class Palindrome_Number {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in); // Create an instance of the Scanner class.
        System.out.println("Enter the number : ");
        int a = scanner.nextInt();

        int remainder = 0;
        int reverse = 0;
        for (int b = a; b != 0; b = b / 10 ) {
            remainder = b % 10;
            reverse = reverse * 10 + remainder;

        }
        if (a == reverse) {
            System.out.println("Entered number is a palindrome.");
        } else {
            System.out.println("Entered number is not a palindrome.");
        }
    }
}
