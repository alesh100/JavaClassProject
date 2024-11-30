import java.util.*;
public class List5_4 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_QUESTION = 10;
        int correctCount = 0;
        int count = 0;
        Long startTime = System.currentTimeMillis();
        String output = "";
        while(count < NUMBER_OF_QUESTION) {
            int number1 = 1 + (int) (Math.random() * 15);
            int number2 = 1 + (int) (Math .random() * 15);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("what is " + number1 + " - " + number2 + "?");
            int answer = input.nextInt();

            if (answer == (number1 - number2)){
                System.out.println("you are right");
                correctCount++;
            }
            else
                System.out.println("you're wrong " + number1 + " - "  +
                        number2 + " should be " + (number1 - number2)) ;

            count++;

            output += "\n " + number1 + " - " + number2 + " = " + answer +
                    ((number1 - number2 == answer)? "corect" : "wrong");

        }
        Long endTime = System.currentTimeMillis();
        Long duration = endTime - startTime;

        System.out.println("Correct count is " + correctCount + "\n " +
                "Test time is " + duration / 1000 + "seconds\n " + output );
    }
}
