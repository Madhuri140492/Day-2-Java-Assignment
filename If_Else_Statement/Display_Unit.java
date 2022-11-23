

// Write a Java Program to Read a Number 1,10,100,1000 and display unit, ten hundred Using IF Else Statement.

package Day2_PracticeProblem.If_Else_Statement;
import java.util.Scanner;
public class Display_Unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        if (a < 10) {
            System.out.println("Entered number's unit is one");
        } else if (a < 100) {
            System.out.println("Entered number's unit is ten");
        } else if (a < 1000) {
            System.out.println("Entered number's unit is hundred");
        } else if (a < 100000) {
            System.out.println("Entered number's unit is thousand");
        } else {
            System.out.println("Enter a Valid Number");
        }
    }
}
