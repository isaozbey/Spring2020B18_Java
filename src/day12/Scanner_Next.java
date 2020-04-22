package day12;

import java.util.Scanner;

public class Scanner_Next {

    public  static void main(String[]args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter some number");
        int num=input.nextInt();
         input.nextLine();
        System.out.println("Enter your name");
        String name=input.nextLine();

        System.out.println("Some number:"+num);
        System.out.println("name:"+name);

    }
}
