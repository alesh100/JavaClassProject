import java.util.*;
public class Ex5_1 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        int positiveCount = 0;
        int negativeCount = 0;
        int count = 0;
        int total = 0;

        int number = input.nextInt();
        if (number == 0){
            System.out.println("no number are entered except o");
            System.exit(1);
        }
        while (number != 0) {
            if (number > 0)
                positiveCount++;
            else
                negativeCount++;
            total = total + number;
            count++;
            number = input.nextInt();
        }

        double average = total / count;
        System.out.println("The number of positive is " + positiveCount +
                "\n The number of negative is " + negativeCount +
                "\n The total is " + total +
                "\n The average is " + average);
    }
}
