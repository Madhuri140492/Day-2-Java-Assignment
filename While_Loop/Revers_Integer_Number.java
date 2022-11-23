

//Write a Java Program to reverse the integer number eg. Input n=231 reverse is 132.

package Day2_PracticeProblem.While_Loop;
public class Revers_Integer_Number {
    public static void main(String[] args){

        int num = 231, reversed = 0;

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);

    }
}
