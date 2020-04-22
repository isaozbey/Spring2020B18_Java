package day20;

import java.util.Scanner;

public class Days {

    public static void main(String [] args) {
        Scanner input= new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        String  result="";

        System.out.println("Enter a day");
        int num=input.nextInt();
         int attempt=0;
        while (num>6 ||num<0) {

            System.out.println("Please re-enter number agfain");
            num=input.nextInt();
            attempt++;
            if (attempt==2 && (num>6 ||num<0) ) {
                System.exit(0);
            }
        }

        result=days[num-1];

        System.out.println(result);






    }
}
