package Individual;

import java.util.Random;
import java.util.Scanner;

public class positivineAndNegative {
    public  static  void main (String [] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
         premium=Math.round(premium);
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name=scan.nextLine();
        System.out.println("Do you have a US driver license?");
        String driverLicense =scan.next();
        if (driverLicense.equalsIgnoreCase("No")) {
            System.out.println("Invalid data!");
            System.exit(0);

        }

        System.out.println("Enter your zip code");
        String zipCode=scan.next();

        if (zipCode.equals("20910") || zipCode.equals("20740") ) {
            premium+=60;
        }else if (zipCode.equals("22102") || zipCode.equals("22103") ) {
            premium+=30;
        }else {
            premium+=50;
        }

        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership=scan.next();
        if (vehicleOwnership.equalsIgnoreCase("owned")) {
            premium+=10;
        }else {
            premium+=20;
        }


        System.out.println("How is this vehicle primarily used?");
        vehicleUsage=scan.next();
        if (vehicleUsage.equalsIgnoreCase("Business")){
            premium+=50;
        }else if  (vehicleUsage.equalsIgnoreCase("Pleasure")) {
            premium+=10;
        }else if (vehicleUsage.equalsIgnoreCase("Commute")) {
            premium+=20;
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool=scan.nextInt();
            premium=premium+(daysDrivenToWorkOrSchool*5);

            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool=scan.nextInt();
            premium=premium+(milesToWorkOrSchool*1);

        }

        System.out.println("How old are you?");
        int age=scan.nextInt();
        if (age<16) {
            System.out.println("Invalid data!");
            System.exit(0);
        }else if (age<=16 && age<18) {
            premium=premium+(premium*0.20);
        }else if (age<=18 && age<=21) {
            premium=premium+(premium*0.06);
        }else if (age<21 && age<25) {
            premium=premium+(premium*0.02);
        }



        System.out.println("How many years you've been driving?");
        int drivingYears=scan.nextInt();
        if (drivingYears<=0) {
            System.out.println("Invalid data!");
            System.exit(0);
        }else {
            premium=premium-(drivingYears*5);
        }


        System.out.println("Have you had any accidents in the last 5 years?");
        String accident=scan.next();
        if (accident.equalsIgnoreCase("yes")) {
            System.out.println("How many?");
            accidentsAmount=scan.nextInt();
            premium=premium+(premium*0.20);
        }

        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance=scan.next();
        if (continuousInsurance.equalsIgnoreCase("No")) {
            premium*=premium;
        }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
        education=scan.nextLine();
        if (education.equalsIgnoreCase("PhD") ||education.equalsIgnoreCase("Bachelors") || education.equalsIgnoreCase("Masters")) {
            premium=premium-(premium*0.05);
        }else if (education.equalsIgnoreCase("Doctors")) {
            premium=premium-(premium*0.10);
        }else {
            premium=premium-(premium*0.05);
        }


        System.out.println(name+", here's your quote!");
        System.out.println("Start Your Policy Today For: $"+premium);

        referenceNumber=name.substring(0,2)+age+name.substring(name.length()-2)+zipCode+education.trim();
        referenceNumber=referenceNumber.toUpperCase();
        System.out.println("Reference number: "+referenceNumber);


    }

}
