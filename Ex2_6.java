import java.io.FilterOutputStream;
import java.util.*;
public class Ex2_6 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        //prompt user to enter number between (0 to 1000)
        System.out.print("Enter number between 0 to 1000: ");

        int number = input.nextInt();
        int number1 = number % 10;

        int numberDiv = number / 10;

        int number2 = numberDiv % 10;
        int number3 = numberDiv / 10;

        int sum = number1 + number2 + number3;

        // result

        System.out.println("the result is " + sum);

    }
}
