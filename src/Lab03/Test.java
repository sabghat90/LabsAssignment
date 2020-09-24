package Lab03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter The Person Information...\n");

        System.out.print("First Name: ");
        String firstName;
        firstName = scan.nextLine();

        System.out.print("Last Name: ");
        String lastName;
        lastName = scan.nextLine();

        System.out.print("Gender: ");
        String gender;
        gender = scan.nextLine();

        System.out.print("Date of Birth (DD/MM/YY): ");
        int day;
        int month;
        int year;
        day = scan.nextInt();
        month = scan.nextInt();
        year = scan.nextInt();

        System.out.print("Height in Inches: ");
        double heightInInches;
        heightInInches = scan.nextDouble();

        System.out.print("Weight in Pounds: ");
        double weightInPounds;
        weightInPounds = scan.nextDouble();

        HealthProfile person = new HealthProfile(firstName,lastName, gender,day,month,year,heightInInches,weightInPounds);

        System.out.println(person);

        System.out.println("\n\nBMI VALUES\n" +
                "Underweight: less than 18.5\n" +
                "Normal: between 18.5 and 24.9\n" +
                "Overweight: between 25 and 29.9\n" +
                "Obese: 30 or greater");
    }
}
