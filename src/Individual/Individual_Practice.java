
package Individual;


import java.util.Scanner;

public class Individual_Practice {


    public static void main(String[] args ){

        char finalGrade='k';

        String status=finalGrade=='A' ?"Early Bird" :finalGrade=='B'? "Group 1" : "Repeat";

       int score=170;
       char finals=' ';


       finals=(score>=90 &&score<=100) ? 'A'
               :(score<90 && score>=80) ? 'B'
               :(score<80 &&score>=70) ? 'C'
               :(score<70 &&score>=60) ?'D'
               :(score<60 && score>=0) ? 'F'
               :' ';

       System.out.println(finals);

        Scanner input= new Scanner(System.in);


      int number=9;


      String numV="";

      numV= number>=0 && number<=9 ? "nine" :number==10 ? "Invalid Number": "Other number";

      System.out.println(numV);








    }
}
