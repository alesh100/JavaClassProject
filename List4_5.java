import java.util.*;
public class List4_5 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String lottery = "" + (int)(Math.random() * 10) + (int)(Math.random() * 10);
        //prompt the user to enter a guess
        System.out.print("Enter your lottery pick (two digit): ");
        String guess = input.nextLine();

        // get digits from lottery
        char lotteryDigit1 = lottery.charAt(0);
        char lotteryDigit2 = lottery.charAt(1);

        // get digits from guess
        char guessDigit1 = guess.charAt(0);
        char guessDigit2 = guess.charAt(1);

        if(guess.equals(lottery))
            System.out.println("you won $10,000");
        else if (lotteryDigit1 == guessDigit2 && lotteryDigit2 == guessDigit1)
            System.out.println("You won $3,000");
        else if (lotteryDigit1 == guessDigit1 || lotteryDigit1 == guessDigit2 ||
        lotteryDigit2 == guessDigit1 || lotteryDigit2 == guessDigit2) {System.out.println("You won $1,000");
        }
        else
            System.out.println("sorry, no match");
    }
}
