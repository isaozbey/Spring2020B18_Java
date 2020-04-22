package Individual;

import java.util.Scanner;

public class Practice_3$23 {


    public static void main (String []args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name:");
        String name = input.nextLine();

        System.out.print("Enter your last name:");
        String lastName = input.nextLine();

        String fullName= name.concat(" ").concat(lastName);



        int   fullnameLength=fullName.length()-1;

        char lastChar=fullName.charAt(fullnameLength);
        System.out.println(lastChar);






    }

   }
