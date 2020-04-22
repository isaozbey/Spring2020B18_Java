package day06_Shorthnd_LogicalOprators;

import java.util.Scanner;

public class ComputeAreaWithConsoleINput {

    static Scanner input = new Scanner(System.in);

    public static void main(String [] args) {


        System.out.print("Enter a number of radius: ");
        double radius =input.nextDouble();
        double area = radius*radius*3.14159;
        System.out.println("The area for the corcle od radius " +radius +" is " + area);

        System.out.print("enter second number:");
        int number =input.nextInt();

        boolean evenNumb= number%2==0;
        System.out.println(evenNumb);


    }
}
