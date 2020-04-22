package Individual;
import java.util.Scanner;
public class hotelBooking {
    public static void main (String [] args) {

        Scanner input = new Scanner(System.in);
        double totalPrice = 0;

        while (true) {


            System.out.println("Which bedrom do you want to book?");

            String book = input.nextLine();
             while (!(book.equalsIgnoreCase("King Bed") || book.equalsIgnoreCase("Queen Bed") || book.equalsIgnoreCase("Single Bed"))) {
                 System.out.println("Invalid Entry, Please Enter your room again ");
                 book = input.nextLine();
             }

            if (book.equalsIgnoreCase("King Bed")) {
            totalPrice += 120;
            } else if (book.equalsIgnoreCase("Queen bed")) {
            totalPrice += 100;
             } else if (book.equalsIgnoreCase("Single Bed")) {
            totalPrice += 80;
             }

            System.out.println("Do you want to book another room");
            String answer=input.nextLine();

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entry, Do you want to book another room again?");
                answer=input.nextLine();
            }

            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for choosing us, Your total balance is:"+totalPrice);
                System.exit(0);
            }
        }



    }
}
