//Write a Java Program to Find the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5 With For Loop.

package Day2_PracticeProblem.For_Loop;

import java.util.Scanner;
public class NaturalNumber
{
    public static void main(String args[])
    {
        int sum = 0;
        System.out.print("Enter the number value:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; ++i)
        {
            sum = sum +i;
        }

        System.out.println("Sum of numbers : " + sum);
    }
}
