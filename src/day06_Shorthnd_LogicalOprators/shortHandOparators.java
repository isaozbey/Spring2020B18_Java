package day06_Shorthnd_LogicalOprators;
import java.util.Scanner;
public class shortHandOparators {

    public static void main(String [] args) {

            // DO NOT CHANGE:
            Scanner input = new Scanner(System.in);
            int vehicleYear = input.nextInt();

            //WRITE YOUR CODE HERE:

            if(vehicleYear==1995 ||vehicleYear==1996) {

                System.out.println("Your vehicle needs to be recalled!");
            }
            else
            {
                System.out.println("Your vehicle is fine, enjoy!");
            }
        }

    }

