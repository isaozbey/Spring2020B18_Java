package Individual;

import java.util.Scanner;

public class Invidual_Practice03$25_1 {

    public static void main (String[]args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first name");
       String  firstName=scan.nextLine();
        System.out.println("Enter your last name");
        String lastName=scan.nextLine();
        lastName=lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

       firstName=firstName.substring(0,1).toUpperCase() +firstName.substring(1,firstName.length()).toLowerCase();
       System.out.println(firstName);







    }
}
