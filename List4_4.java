import java.util.*;
public class List4_4 {
    public  static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        if(hexString.length() != 1){
            System.out.println("you must enter exactly one character");
            System.exit(1);
        }

        char ch = Character.toUpperCase(hexString.charAt(0));
        if (ch <= 'F' && ch >= 'A'){
            int value = ch - 'A' + 10;
            System.out.println("the decimal value for hex digit " + ch +
                    " is " + value);
        }
        else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit" + ch  + " is " + ch);
        }
        else
            System.out.println(ch + " is an invalid input");
    }
}
