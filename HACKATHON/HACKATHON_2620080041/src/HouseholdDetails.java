import java.util.Scanner;

public class HouseholdDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        int numberOfFamilyMembers;   
        double waterConsumedLitres;  
        int houseNumber;             
        char waterUsageStatus;      

        System.out.print("Enter number of family members: ");
        numberOfFamilyMembers = sc.nextInt();

        System.out.print("Enter water consumed in litres: ");
        waterConsumedLitres = sc.nextDouble();

        System.out.print("Enter house number: ");
        houseNumber = sc.nextInt();

        System.out.print("Enter water usage status (LOW/MEDIUM/HIGH): ");
        waterUsageStatus = sc.next().charAt(0);

        System.out.println("\n----- Household Details -----");
        System.out.println("Number of Family Members  " + numberOfFamilyMembers);
        System.out.println("Water Consumed (Litres)   " + waterConsumedLitres);
        System.out.println("House Number              " + houseNumber);
        System.out.println("Water Usage Status       : " + waterUsageStatus);

        sc.close();
    }
}