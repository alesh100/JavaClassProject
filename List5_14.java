import java.util.*;
public class List5_14 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string");
        String word = input.nextLine();


        boolean isPalindrome = true;
        for(int low = 0, high = word.length() - 1; low < high; low++, high--) {
            if (word.charAt(low) != word.charAt(high)) {
                isPalindrome = false;
                break;
            }

        }


        if (isPalindrome)
            System.out.println("the word " + word + " is palindrome");
        else
            System.out.println("the word " + word + " is not palindrome");
    }
}
