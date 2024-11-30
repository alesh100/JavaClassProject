import java.util.*;
public class TestLoadClass {
    public static void main(String [] args){
        // create a scanner
        Scanner input = new Scanner(System.in);

        //Enter annual interest rate
        System.out.print(
                "Enter annual interest rate, for examole, 8.25: ");
        double annualInterestRate = input.nextDouble();

        //enter number of year
        System.out.print("enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        // enter loan amount
        System.out.print("enter loan amount : ");
        double loanAmount = input.nextDouble();

        //create a loan object
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // display loandate, monthly payment, and total payment
        System.out.printf("the loan was created on %s\n the monthly payment is %.2f\n " +
                "the total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                loan.getTotalPayment());

    }
}
