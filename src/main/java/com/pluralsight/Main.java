package com.pluralsight;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello World!");

        //known values
        double priceOfBasicCarRentalPerDayBasicCarRentalPerDay = 29.99;
        double priceOfOptionTollTag = 3.95;
        double priceOfOptionGPS = 2.95;
        double priceOfOptionRoadSideAssistance = 3.95;
        double salesTax = 1.0725;
        float percentSurchargeForUnderage = 0.30f;
        int userAgeLimit = 25;


        //what do I need to get from user?
        System.out.print("When do you want to rent the car?:");
        String pickUpDate = scanner.nextLine();
        System.out.println("How many days do you need it?:");
        int numberOfDays = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Do you want a toll tag? (Y/N):");
        boolean optionTollTag = scanner.nextLine().equalsIgnoreCase("y");
        System.out.println("Do you want a GPS? (Y/N):");
        boolean optionGPS = scanner.nextLine().equalsIgnoreCase("y");
        System.out.println("Do you want Road Side Assistance?: (Y/N):");
        boolean optionRoadSideAssistance = scanner.nextLine().equalsIgnoreCase("y");
        System.out.println("How old are you?: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        //what needs to be calculated?
        double basicCarRentalAmount = numberOfDays * priceOfBasicCarRentalPerDayBasicCarRentalPerDay;
        double optionPerDayCumulative = (optionTollTag) ? priceOfOptionTollTag : 0;
        optionPerDayCumulative += (optionGPS) ? priceOfOptionGPS :0;
        optionPerDayCumulative += (optionRoadSideAssistance) ? priceOfOptionRoadSideAssistance : 0;
        double optionsAmount = optionPerDayCumulative * numberOfDays;

        double underAgeSurcharge = 0;
        if (age < userAgeLimit){
            underAgeSurcharge = basicCarRentalAmount * percentSurchargeForUnderage;
        }
        double totalCost = (basicCarRentalAmount + optionsAmount + underAgeSurcharge) * salesTax;

        //display the results
        System.out.println("Here is the quote for your rental: ");
        System.out.printf("Basic Car Rental:    $%.2f\n", basicCarRentalAmount);
        System.out.printf("options Amount:      $%.2f\n", optionsAmount);
        System.out.printf("underage fee:        $%.2f\n", underAgeSurcharge);
        System.out.printf("Your total cost is:  $%.2f\n", totalCost);




    }
}