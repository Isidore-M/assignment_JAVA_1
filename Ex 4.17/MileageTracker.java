import java.util.Scanner;

public class MileageTracker {
    public static void main(String[] args) {
        Scanner track1 = new Scanner(System.in);

        int totalMiles = 0;
        int totalGallons = 0;

       
            System.out.print(" Please, enter driven miles, (it can't be negative)  : ");
            int numMiles = track1.nextInt();

            if (numMiles == -1) {
               
            }

            else {System.out.print("Now enter gallons used: ");
            int gallons = track1.nextInt();

            double mpg = numMiles / gallons;
            System.out.printf("Miles per gallon for this trip: %.2f%n", mpg);

            totalMiles += numMiles;
            totalGallons += gallons;

            double totalMpg =  totalMiles / totalGallons;
            System.out.printf("Combined miles per gallon so far: %.2f%n%n", totalMpg);
        }
        
    
    }
}