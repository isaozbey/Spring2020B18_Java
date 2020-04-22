package Individual;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class loops04$04 {
    public static void main (String []args) {

        Random rand= new Random();
        int number=rand.nextInt(100);

        Scanner scan=new Scanner(System.in)    ;


        while (true) {
            System.out.print("Guess number:");
            int guess=scan.nextInt();

            if (guess==number) {
                System.out.println("Yes, the number is "+number);
                break;
            }else if (guess>number) {
                System.out.println("your guess is too high");
                continue;
            }else if (guess<number) {
                System.out.println("Your guess is too low.");
            }

        }

        do {

        }while (1<10);
    }
}
