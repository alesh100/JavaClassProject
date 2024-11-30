import java.util.*;
public class Listing5_5 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter an integer number , if you enter 0 te program will end: ");

        int number = input.nextInt();

        int sum = 0;
        while(number != 0) {
            sum += number;
            System.out.print("enter an integer number , if you enter 0 te program will end: ");
            number = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
