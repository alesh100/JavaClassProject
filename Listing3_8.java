import java.util.*;
public class Listing3_8 {
    public static void main (String [] args) {
        int lottery = (int)(Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.print("enter your lottery pick (two digit)");
        int guess = input.nextInt();
         // get digit from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        // get digit from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery)
            System.out.println("you won $10,000");
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
            System.out.println("you won $3000");
        else if (lotteryDigit1 == guessDigit1 ||
        lotteryDigit1 == guessDigit2 || lotteryDigit2 == guessDigit1 ||
        lotteryDigit2 == guessDigit2) { System.out.println("you won $1000"
        );
        }
        else
            System.out.println("Sorry, no match");
    }
}
