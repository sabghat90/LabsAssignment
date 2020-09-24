package Lab01;

import java.util.Scanner;

public class Car {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String carName;
        System.out.print("Enter car name: ");
        carName = scan.nextLine();

        double distanceTravelled;
        System.out.print("Distance travelled in kilometers: ");
        distanceTravelled = scan.nextDouble();

        double fuelConsumption;
        System.out.print("Fuel Consumption in Liters: ");
        fuelConsumption = scan.nextDouble();

        double pricePerLitter;
        System.out.print("Price Per Litter: ");
        pricePerLitter = scan.nextDouble();

        double fuelConsumed = distanceTravelled / fuelConsumption;
        double totalCost = fuelConsumption * pricePerLitter;

        System.out.printf("the name of your car is: %s%nYour per liter consumption is: %.2f%n%n" +
                "The total cost is: %.2f%n%n",
                carName,fuelConsumption,totalCost);
        fuelEfficiency(fuelConsumed);
    }

    public static void fuelEfficiency(double fuelConsumed) {

        if (fuelConsumed >= 20) {
            System.out.println("our car is highly fuel efficient");
        }

        else if (fuelConsumed >= 15 && fuelConsumed < 20) {
            System.out.println("Your car is fuel efficient");
        }

        else if (fuelConsumed >= 10 && fuelConsumed < 15) {
            System.out.println("Your car needs tuning");
        }

        else
            System.out.println("You need to see a mechanic");
    }
}
