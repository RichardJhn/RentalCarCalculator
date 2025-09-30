package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //known values
        double priceOfOptionTollTag = 3.95;
        double priceOfOptionGPS = 2.95;
        double priceOfOptionRoadSideAssistance = 3.95;
        float percentSurchargeForUnderage = 0.30f;
        int userageLimit = 25;
        //what do I need to get from user?

        System.out.print("When do you want to rent the car?:");
        String pickUpDate;

        System.out.println("How many days do you need it?:");
        int numberOfDays;
        System.out.println("Do you want a toll tag? (Y/N):");
        boolean optionTollTag;
        System.out.println("Do you want a GPS? (Y/N):");
        boolean optionGPS;
        System.out.println("Do you want a toll tag (Y/N):");
        boolean optionRoadSideAssistance;
        int age;
        //what needs to be calculated?

        double basicCarRentalAmount;
        double optionsAmount;
        double underageSurcharge;
        double totalCost;


    }
}