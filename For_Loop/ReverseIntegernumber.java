//Write a Java Program to reverse the integer number eg. Input n=231 reverse is 132 with For Loop.

package Day2_PracticeProblem.For_Loop;

public class ReverseIntegernumber {
    public static void main(String[] args) {

        int num = 231, reversed = 0;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
