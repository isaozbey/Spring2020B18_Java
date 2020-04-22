package day11_Scanner;
/*
 2. write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
 */

import java.util.Scanner;
public class WarmUp_3$26 {

    public static void main (String[]args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter employee's salary:");
        int salary=scan.nextInt();

        System.out.println("Enter stae tax:");
        byte stateTax=scan.nextByte();
        double stateTaxPercentage=stateTax/100.0;

        System.out.println("Enter federal tax:");
        byte federalTax=scan.nextByte();
        double federalTaxPercentage=federalTax/100.0;


        double totalTax=(federalTaxPercentage+stateTaxPercentage)*salary;

        double salaryAfterTax=salary-totalTax;

        System.out.println("your salary after taxes is: " +salaryAfterTax);

    }
}
