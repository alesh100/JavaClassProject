import java.util.*;
public class Listing3_3 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        // generate random number
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // swap if number1 < number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("what is " + number1 + " - " + number2 + " ?");
        int answer = input.nextInt();

        if(number1 - number2 == answer)
            System.out.println("You are correct");
        else
            System.out.println("the of " + number1 + " - " + number2 + " = " + (number1 - number2));
    }
}