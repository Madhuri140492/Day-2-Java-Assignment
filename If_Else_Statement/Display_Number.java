// Write a Java Program to Read a Number 1,10,100,1000 and display unit, ten hundred Using IF Else Statement.

package Day2_PracticeProblem.If_Else_Statement;
import java.util.Scanner;
public class Display_Number {
    public static void main(String[] args) {

        System.out.println("Enter a Number From 1, 10, 100, 1000 : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println(a + " = Unit ");
        } else if (a == 10) {
            System.out.println(a + " = Ten ");
        } else if (a == 100) {
            System.out.println(a + " = Hundred ");
        } else if (a == 1000) {
            System.out.println(a + " = Thausand ");
        } else {
            System.out.println("Enter the Number between given Number : ");
        }
    }
}
