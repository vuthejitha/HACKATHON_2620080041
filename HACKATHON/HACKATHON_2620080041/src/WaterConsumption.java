import java.util.Scanner;

public class WaterConsumption {
    
    // Method to calculate total water consumption
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter morning water usage in litres: ");
        int morningUsage = sc.nextInt();
        
        System.out.print("Enter evening water usage in litres: ");
        int eveningUsage = sc.nextInt();

        // Call the method and store the returned value
        int totalConsumption = calculateTotal(morningUsage, eveningUsage);

        System.out.println("Total Water Consumption: " + totalConsumption + " litres");

        sc.close();
    }
}