package CarLoanPaymentCalculator;

// A program that calculates a car payment.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, insert a full car price.");
        int carLoan = scanner.nextInt();
        System.out.println("Please, insert a length of the loan.");
        int loanLength = scanner.nextInt();
        System.out.println("Please, insert an interest rate.");
        int interestRate = scanner.nextInt();
        System.out.println("Please, insert a down payment.");
        int downPayment = scanner.nextInt();

        System.out.println("Full car price: " + carLoan);
        System.out.println("Length of loan: " + loanLength);
        System.out.println("Interest rate: " + interestRate);
        System.out.println("Down payment: " + downPayment);

        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } else {
            int remainingBalance = carLoan - downPayment;
            int months = loanLength * 12;
            int monthlyBalance = remainingBalance / months;
            int interest = monthlyBalance * interestRate / 100;
            int monthlyPayment = monthlyBalance + interest;
            System.out.println("Your monthly payment for your car will be " + monthlyPayment);
        }
    }
}
