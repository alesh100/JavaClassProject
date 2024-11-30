
import java.util.*;
public class Ex2_1 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        //prompt user to enter celsius
        System.out.print("Enter the celsius: ");

        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("The celsius is " + celsius + " and fahrenheit is " + fahrenheit);


    }
}
