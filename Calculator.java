import java.util.Scanner;

public class Calculator {
    public static void main(String [] args){
        //check number of the passed
        //java.util.Scanner input =new Scanner(System.in);

        if(args.length != 3){
            System.out.println("usage: java calculator operand1 operator operand2");
            System.exit(0);
        }

        //result of the operation
        int result = 0;
        //determine the operator
        switch(args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0]) +
                    Integer.parseInt(args[2]);
            break;
            case '-': result = Integer.parseInt(args[0]) -
                    Integer.parseInt(args[2]);
                break;
            case '.': result = Integer.parseInt(args[0]) *
                    Integer.parseInt(args[2]);
                break;
            case '/': result = Integer.parseInt(args[0]) /
                    Integer.parseInt(args[2]);

        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
           }
}
