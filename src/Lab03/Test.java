package Lab03;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter The Person Information...");

        HealthProfile[] persons = new HealthProfile[1];

        persons[0] = new HealthProfile("Khan","Khan","Male",12,2,2010,5.9,400);

        System.out.println(persons[0]);
    }
}
