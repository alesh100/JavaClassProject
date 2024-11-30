import java.util.*;
public class DeckOfCard {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of card: ");
        int number = input.nextInt();
        int [] deck = new int[number];
        String [] suits ={"Spades", "Hearts", "Diamond", "Clubs"};
        String [] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King"};

        //initialize the cards
        for(int i = 0; i < deck.length; i++)
            deck[i] = i;

        for(int i = 0; i < deck.length; i++){
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        for(int i = 0; i < 4; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println("card number " + deck[i] + ": " + rank +
                    " of " + suit);
        }

    }
}
