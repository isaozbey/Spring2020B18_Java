package Individual;

import java.util.Scanner;

public class IndiviualPractice03$27_1 {

    public  static void main (String []args){


        int result=0;

        for (int i=1;i<1000; i++) {
            result+=i;
        }
        System.out.println("Total:"+result);
        int sumEven=0;
        int sumOdd=0;
        for (int k=1; k<1000;k++) {

            if (k%2==0) {
                sumEven+=k;
            }else {
                sumOdd+=k;

            }

        }
        System.out.println("Even Number Total:"+sumEven);
        System.out.println("Odd Number total:"+sumOdd);

        int sumNumbers=0;
        String str1= new String("Hello");
        String  str2=new String("Hello");

        System.out.println(str1==str2);

        Scanner input= new Scanner(System.in);
        int maxNumber=0;
        int minNumber=0;
        for (int i=1;i<=10;i++) {
            System.out.print("Enter "+i+". Number:");
            int num=input.nextInt();

            if(num>maxNumber)
                maxNumber=num;
            if(num<minNumber)

            sumNumbers+=num;

        }
        //System.out.println("Sum of Numbers:"+sumNumbers);
        System.out.println("Max Number:"+maxNumber);
        System.out.println("Min Number:"+minNumber);
    }
}

