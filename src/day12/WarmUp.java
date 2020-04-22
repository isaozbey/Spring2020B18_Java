package day12;


import java.util.Scanner;

public class WarmUp {


    /*

    2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight
    3. Write a Java Program that can calculate the garde of a student based on the score,
        implement the following logic:
                If marks < 60, then print “Fail”
                If marks >= 60, but less than 90, then print “Pass”
                If marks >= 90, then print “Passed with Distinction”
                MUST use scanner

     */
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
       /* double PI=3.14;
        double radious ;
        double areaCircle=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter radious of circle");
        radious=scan.nextDouble();

        int areaCircle1= (int)(radious*radious*PI);

        System.out.println("Area of circle:"+areaCircle1);

       */

       /*
       String result=" ";
       System.out.println("Enter first word:");
       String s1=scan.nextLine();
        System.out.println("Enter Second word:");
       String s2=scan.nextLine();
       result=s1+s2;
       System.out.println(result);
      */
        System.out.println("Enter your grade");
       int grade =scan.nextInt();
       String result2= "";


       if (grade>=0 && grade<=100) {

           if (grade >= 60 && grade < 90) {
               result2 = "Pass";
           } else if (grade >= 90) {
               result2 = "Passes with Distinction";
           } else {
               result2 = "Fail";
           }
       }else {
           System.out.println("Invalid Grade");
       }
       System.out.println(result2);
    }
}
