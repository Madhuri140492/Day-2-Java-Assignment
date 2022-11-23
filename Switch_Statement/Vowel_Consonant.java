//Write a Java Program to Check Vowel or Consonant

package Day2_PracticeProblem.Switch_Statement;
import java.util.Scanner;
public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter a Alphabet : ");
        char Al = r.next().charAt(0);
        switch (Al) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(Al + " is a vowel.");
                break;
            default:
                System.out.println(Al + " is a consonant.");
        }
    }
}
