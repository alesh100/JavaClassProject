import java.util.Scanner;

public class HelloGoodbye {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        // input the user name 
        System.out.print("Enter the two users name: ");
        String firstUserName = input.next();
        String secondUserName = input.next();

        // print
        System.out.println("Hello " + firstUserName + " and " + secondUserName + "." );
        System.out.println("Goodbye " + secondUserName + " and " + firstUserName + "." );

        
    }
    
}
