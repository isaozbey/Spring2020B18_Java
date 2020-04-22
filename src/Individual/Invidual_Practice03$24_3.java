package Individual;

import java.util.Scanner;

public class Invidual_Practice03$24_3 {

    public static void main (String[]args) {


        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first and lastname");

        String name=input.nextLine();
        String lastName=input.nextLine();

        String initials=name.charAt(0)+ "."+lastName.charAt(0);
        initials=initials.toUpperCase();



         String initials2=name.substring(0,1)+ "."+lastName.substring(0,1);
         initials2=initials2.toUpperCase();

        //System.out.println(initials);

        //System.out.println(initials2);

        String lastinitials=name.charAt(name.length()-1)+"."+lastName.charAt(lastName.length()-1);

        lastinitials=lastinitials.toUpperCase();
        //System.out.println(lastinitials);

        String lastinitials2=name.substring(name.length()-1) + "."+lastName.substring(lastName.length()-1);
        System.out.println(lastinitials2);


    }
}
