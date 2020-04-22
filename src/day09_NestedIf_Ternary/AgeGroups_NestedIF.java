package day09_NestedIf_Ternary;

import java.util.Scanner;

public class AgeGroups_NestedIF {

    /* Write a program taht define the age groups of a person

    age groups
   teneager
    Adult
    Senior
     */

    public static void main(String[]args) {

       Scanner input= new Scanner(System.in);

       System.out.println("Please enter you zip code");
       int zipCode=input.nextInt();

       System.out.println("Please enter your city name");
       String cityName=input.nextLine();


       System.out.println("Enter your phone number:");
       input.nextLine();
       int pn=input.nextInt();

       System.out.println("zip code: "+zipCode);
       System.out.println("City name: "+cityName);



    }



}
