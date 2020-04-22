package Individual;

import java.util.Scanner;

public class IndiviualPractice03$26 {

    public static void main(String [] args) {

        Scanner scan= new Scanner(System.in);

        System.out.print("Enter your username:");

        String userName=scan.nextLine();
        userName=userName.toLowerCase();
        System.out.print("Enter your password:");
        String password=scan.next();
        password=password.toLowerCase();

        boolean checkGmail=userName.endsWith("@gmail.com");


        if (checkGmail==true ) {
            System.out.println("Loged in Succesfully");
        }else {
            System.out.println("Invalid username and password");
        }


    }
}
