package Individual;

import java.util.Scanner;
import  java.util.*;

public class Invidual_Practice03$22 {

    public static void main (String [] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter a day :");

        int day =input.nextInt();
       String result= "";

       result= day ==1 ? "Monday"
               :day==2 ? "Tuesday"
               :day==3 ? "Wednesday"
               :day==4 ? "Thursday"
               :day==5  ?"Friday"
               :day==6 ? "Saturday"
               :day==7 ? "Sunday"
               :"No such a day";
       System.out.println(result);

       System.out.print("Enter your vehicle year: ");

       int vehicleYear=input.nextInt();
       String  resul2= "";

       resul2= vehicleYear<=1995 && vehicleYear<=1998 ? "Your vehicle needs to be recalled!"
               : vehicleYear==2001 &&vehicleYear==2002 ? "Your vehicle needs to be recalled!"
               :vehicleYear<=2004 && vehicleYear<=2006 ? "Your vehicle needs to be recalled!"
               :vehicleYear<=2015 && vehicleYear<2017 ? "Your vehicle needs to be recalled!"
               :"\"Your vehicle is fine, enjoy!";

       System.out.println(resul2);




    }
}
