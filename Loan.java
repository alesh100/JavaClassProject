import java.util.*;
public class Loan {
    private double annualInterestRate;
    private int numberOfYear;
    private double loanAmount;
    private Date loanDate;

    //default constructor
    public Loan() {
    }

    //construct a loan with specified annual interest rate, number of years, and loan amount

    public Loan(double annualInterestRate, int numberOfYear, double loanAmount){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYear = numberOfYear;
        this.loanAmount = loanAmount;
        loanDate = new Date();
    }

    //getter and setter

    public double getAnnualInterestRate(){
        return  annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYear(){
        return numberOfYear;
    }

    public void setNumberOfYear(int numberOfYear){
        this.numberOfYear = numberOfYear;
    }

    public double getLoanAmount(){
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }

    //find the monthly payment
    public double getMonthlyPayment(){
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12)));
    }
    // find total payment
    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYear * 12;
    }

    public Date getLoanDate() {
        return loanDate;
    }

}
