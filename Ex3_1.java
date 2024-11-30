
import java.util.*;
public class Ex3_1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        // Generate number randomly using currentTimeMilli
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);

        //
        System.out.print("what is " + number1 + " " + number2 + " ? ");

        // prompt user to enter answer
        int answer = input.nextInt();


        System.out.println("the answer of " + number1 + " " + number2 + " is " + answer + " " +

                ( number1 + number2 == answer) );
    }
}
