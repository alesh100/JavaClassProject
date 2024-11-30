import java.util.*;
public class Listing5_11 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        int decimal = input.nextInt();
        String hex = "";

        while(decimal != 0 ){
            int hexValue = decimal % 16;

            //convert decimal to hex digit
             char hexDigit = (hexValue <= 9 && hexValue >= 1)? (char) (hexValue
             + '0'): (char) (hexValue - 10 + 'A');
             hex = hexDigit + hex;

             decimal = decimal / 16;

        }
        System.out.println(decimal + " " + hex);
    }
}
