import java.io.*;
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("input.txt"));
            int sum = 0;
            while (input.hasNextInt()) {
                int data = input.nextInt();
                if (data == 0) {
                    break;
                }
                sum += data;
                System.out.println("Enter an integer 0 - 9 (0 will end the program): " + data);
            }
            System.out.println("The sum is " + sum);
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
