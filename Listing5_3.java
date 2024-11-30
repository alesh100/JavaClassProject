import java.util.*;
public class Listing5_3 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 101);
        System.out.print("Enter the guess between 0 to 100");

        int guess = -1;
        while (guess != number){
            System.out.print("\n input the guess number");
            guess = input.nextInt();
            if(guess == number)
                System.out.println("you're right");
            else if (guess > number)
                System.out.println("guess to high");
            else
                System.out.print("nuber too low");
        }
    }
}
