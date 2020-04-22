package Individual;
import java.util.Scanner;
public class multipicationTable {
    public static void main (String [] args) {
           /*
        for (int z=1; z<=9; z++) {
            System.out.print(" "+z+" ");
        }


        System.out.println();

        for (int i = 1; i <9 ; i++) {

            for (int k=1;k<=9 ;k++) {

                System.out.print(" "+(i*k)+" ");

            }
            System.out.println("   ");
        }
*/
          /*

        for (int i = 1; i <5; i++) {

            int j=0;

            while (j<i) {
                System.out.print(j+"  ");
                j++;
            }

        }

*/
         /*int i=5;
  while (i>=1) {

      for (int j = 0; j >i ; j++) {
          System.out.print("*");
      }
      System.out.println();
      i--;
  }*/
        /*Scanner input= new Scanner(System.in);

        System.out.println("Enter firs number");
         int number1=input.nextInt();
         System.out.println("Enter second number:");
         int number2=input.nextInt();
         int gcd=1;
         int k=1;
         while (k<number1 && k<number2) {

             if (number1%k==0 && number2%k==0) {
                 gcd=k;
             }
             k++;
         }

System.out.println(gcd);
*/
       /*        double tuition=10000;
        int year=0;
        while (tuition<=20000) {

            tuition=tuition*1.07;
            year++;
        }
        System.out.println(year); */
      /*
       int balance=10;

       while (true) {

           if (balance<9) {
               break;
           }
           balance=balance-9;
       }

       System.out.println("Balance is "+balance); */
      /*

   int i=0; int sum=0; int sum1=0;

        for (int j = 0; j <=4 ; j++) {
            if (j%3==0) continue;
            sum+=j;

        }

        while (i<=4) {
            if (i%3==0) continue;
            sum1+=i;
            i++;
        }
    System.out.println(sum);
        System.out.println(sum1); */
      Scanner input= new Scanner(System.in);
      /*int maxNumber=-999999999;
      int minNumber= 999999999;
        for (int i = 1; i <=5 ; i++) {
            System.out.print("Enter "+i+".Number: ");
            int number=input.nextInt();

            if (number>maxNumber) {
                maxNumber=number;
            }if (number<minNumber) {
                minNumber=number;
            }
        }
      System.out.println("max number is :"+maxNumber);
        System.out.println("Minimum number is "+minNumber);*/
      String word = " ";
         int maxWordLength=-9999999;
        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter "+i+".word");
            word=input.nextLine();
            if (word.length()>maxWordLength) {
                maxWordLength=word.length();
            }
        }
System.out.println(maxWordLength);
    }

}
