package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main (String[]args) {




        Scanner scan= new Scanner(System.in);
        System.out.println("enter your name");
        String name=scan.nextLine();
        System.out.println(name);
        System.out.println("enter your last  name");
        String lname=scan.next();
        System.out.println(lname);
    }
}
