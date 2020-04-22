package Individual;

import java.util.Scanner;

public class kmToMiles {
    public static void main(String [] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter km you want to convert");
        int km=input.nextInt();

        converMiles(km);

        System.out.println("Enter gallons you want to convert: ");
        int gallon=input.nextInt();



        converGalToLitter(gallon);
    }




    public static void converMiles(int km) {

        System.out.println(km+" km is equal to "+km*0.621371+"miles");
    }

    public static void converGalToLitter(int gallon) {
        System.out.println(gallon+" gallon is equal to :"+gallon*3.78541);
    }

}
