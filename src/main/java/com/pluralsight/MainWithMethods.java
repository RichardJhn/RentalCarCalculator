package com.pluralsight;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;

public class MainWithMethods {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //known values
        double pricePerDay = 29.99;
        double priceOfOptionTollTag = 3.95;
        double priceOfOptionGPS = 2.95;
        double priceOfOptionRoadSideAssistance = 3.95;
        double salesTax = 1.0725;
        float percentSurchargeForUnderage = 0.30f;
        int userAgeLimit = 25;


        //what do I need to get from user?
        System.out.print("When do you want to rent the car?:");
        String pickUpDate = scanner.nextLine();
        int numberOfDays = askInt(scanner, "How many days do you need it?: ");
        boolean optionTollTag = askYesNo(scanner, "Do you want a toll tag? (Y/N:) ");
        boolean optionGPS = askYesNo(scanner, "Do you want GPS? (Y/N:) ");
        boolean optionRoadSideAssistance = askYesNo(scanner, "Do you want roadside assistance? (Y/N:) ");
        int age = askInt(scanner, "How old are you? ");

        //what needs to be calculated?
        double basicAmount = numberOfDays * pricePerDay;
        double optionPerDayCumulative = (optionTollTag) ? priceOfOptionTollTag : 0;
        optionPerDayCumulative += (optionGPS) ? priceOfOptionGPS : 0;
        optionPerDayCumulative += (optionRoadSideAssistance) ? priceOfOptionRoadSideAssistance : 0;
        double optionsAmount = optionPerDayCumulative * numberOfDays;

        double underAgeSurcharge = 0;
        if (age < userAgeLimit) {
            underAgeSurcharge = basicAmount * percentSurchargeForUnderage;
        }
        double totalCost = (basicAmount + optionsAmount + underAgeSurcharge) * salesTax;

        //display the results
        System.out.println("Here is the quote for your rental: ");
        System.out.printf("Basic Car Rental:    $%.2f\n", basicAmount);
        System.out.printf("options Amount:      $%.2f\n", optionsAmount);
        System.out.printf("underage fee:        $%.2f\n", underAgeSurcharge);
        System.out.printf("Your total cost is:  $%.2f\n", totalCost);
    }

    private static double calcOptionAmount(int NumberOfDays, boolean optionTollTag, boolean optionGPS, boolean optionRoadSideAssistance) {
        
    }

    private static boolean askYesNo(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine().equalsIgnoreCase("y");
    }

    private static int askInt(Scanner scanner, String message) {
        System.out.print(message);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

}