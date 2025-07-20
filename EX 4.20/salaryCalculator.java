import java.util.Scanner;

public class salaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        for (int i = 1; i <= 3; i++) {
            System.out.printf("Enter details for Employee %d:%n", i);

        
            System.out.print("Hours worked: ");
            double hoursWorked = input.nextDouble();

            System.out.print("Hourly rate: ");
            double hourlyRate = input.nextDouble();

            double grossPay;

            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                double overtimeHours = hoursWorked - 40;
                grossPay = (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
            }

        
            System.out.printf("Employee %d Gross Pay: $%.2f%n%n", i, grossPay);
        }

        input.close();
    }
}