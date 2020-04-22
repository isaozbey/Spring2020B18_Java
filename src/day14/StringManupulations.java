package day14;

import java.util.Scanner;

public class StringManupulations {

    public static void main(String[] args ) {



        Scanner scan= new Scanner(System.in);
         System.out.println("Enter your username");
        String inputUsername=scan.nextLine();
        System.out.println("Enter your password");
        String  inputPassword=scan.nextLine();

        if (!inputUsername.isEmpty() && !inputPassword.isEmpty()) {

            if (inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool")) {
                System.out.println("Logged in");
            }else if (! inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool")) {
                System.out.println("USername is not correct");
             }else if (inputUsername.equals("Cybertek") && ! inputPassword.equals("Cybertekschool") ) {
                System.out.println("Password is not correct");
            }

        }else {
            System.out.println("Please enter credentailas");
        }


    }
}
