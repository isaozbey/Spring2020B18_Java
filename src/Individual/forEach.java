package Individual;

import java.util.Arrays;
import  java.util.Scanner;
public class forEach {
    public static void main (String [] args) {

        Scanner s = new Scanner(System.in);
        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;
        int totalNight = 1;
        int totalPrice = 1;
       while (true) {

           System.out.println("which bedroom do you wanna reserve?");
           String room = s.nextLine();
           while (!(room.equalsIgnoreCase("king bed") || room.equalsIgnoreCase("queen bed") || room.equalsIgnoreCase("single bed"))) {
               System.out.println("Invalid entry, please re-enter");
               room = s.nextLine();
           }
           if (room.equalsIgnoreCase("king bed")) {
               totalPrice *= kingBed;
           } else if (room.equalsIgnoreCase("queen bed")) {
               totalPrice *= queenBed;
           } else if (room.equalsIgnoreCase("single bed")) {
               totalPrice *= singleBed;
           }
           System.out.println("How many nights?");
           totalNight = s.nextInt();
           totalPrice *= totalNight;
           System.out.println("Do you want to another room");
           String anotherRoom = s.next();
           s.nextLine();
           boolean yesOrNo=!(anotherRoom.equalsIgnoreCase("yes") || anotherRoom.equalsIgnoreCase("no"));
           while (yesOrNo) {
               System.out.println("Invalid entry, please re-enter, yes or no");
               anotherRoom = s.next();
           }
           if (anotherRoom.equalsIgnoreCase("no")) {
               System.out.println("Total price is: $" + totalPrice);
               System.exit(0);
           }


       }
    }
}
