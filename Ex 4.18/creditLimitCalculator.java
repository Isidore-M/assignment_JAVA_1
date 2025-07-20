import java.util.Scanner;

public class creditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
            System.out.print("Enter account number : ");
            int accountNumber = input.nextInt();

            if (accountNumber == -1) {
               System.out.print("You entered a negative number ");
            }

            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            int newBalance = beginningBalance + totalCharges - totalCredits;

            System.out.printf("New balance for account %d: %d%n", accountNumber, newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            } else {
                System.out.println("You still haven't exceeded you credit limit.");
            }
            input.close();
        
        
    }
}