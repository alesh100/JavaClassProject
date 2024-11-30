import java.util.*;
public class Listing6_8 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex number ");
        String hex = input.nextLine();
        System.out.println("the decimal value for hex number " + hex +
                " is " + hexToDec(hex.toUpperCase()));
    }

    public static int hexToDec(String hex){
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDec(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDec(char ch){
        if(ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else
            return ch - '0';
    }
}
