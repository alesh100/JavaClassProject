import java.util.*;
public class Listing5_1 {
    public static void  main (String [] args) {
        Scanner input = new Scanner(System.in);
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        System.out.print("what is the answer between " + number1 + " + "
        + number2 + " ?");
        int answer = input.nextInt();
        while (answer != (number1 + number2)){
            System.out.print("you are wrong! what is the answer between " + number1 + " + " +
                    + number2 + " ?"  );
            answer = input.nextInt();
        }
        System.out.println("you are right");

    }
}
