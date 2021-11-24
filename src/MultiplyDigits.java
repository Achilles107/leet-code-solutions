import java.util.Scanner;

/**
 * The questions says to multiply every digit and give the result.
 * e.g. 1234 -> 1*2*3*4 -> 24 (output)
 * Solution is: if number is less than 10 return that number itself
 * if number is greater than 10:
 * step 1: take a variable x = 1;
 * step 2: divide the number with 10, get the remainder and multiply by x (i.e. x = x * (1234 % 10 = 4))
 * step 3: replace the number with quotient (number = (1234 / 10 = 123))
 * step 4: repeat step 2 until the number becomes 0;
 * return x;
 */
public class MultiplyDigits {
    public static void main(String[] args) {
        // user input for Integer
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number < 10){
            System.out.println(number);
        } else {
            int x = 1;
            while (number != 0){
                int remainder = number % 10;
                x = x * remainder;
                number = number / 10;
            }
            System.out.println(x);
        }
    }
}
