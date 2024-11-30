import java.util.*;
public class Ex2_5 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        // prompt user to enter subtotal and gratuity rate

        System.out.print("Enter subtotal aand gratuity rate in %:");

        int subTotal = input.nextInt();
        int gratuityRate = input.nextInt();

        double gratuity = subTotal * ((double) gratuityRate / 100);
        double total  = subTotal + gratuity;

        System.out.println("the gratuity is $" + gratuity + " and total is $" + total);
    }
}
