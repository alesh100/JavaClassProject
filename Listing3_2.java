import java.util.*;

public class Listing3_2 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter a number: ");
        int number = input.nextInt();

        if(number % 5 == 0)
            System.out.println("HiFive");
        if(number % 2 == 0)
            System.out.println("HiEven");
    }
}