package Individual;

import java.util.Scanner;

public class Individual_Practice03$30 {

    public static void main(String[] args ) {


        /* String  value="AAABCDEEFF";
       String unique="";

        for (int i=0; i<value.length();i++){

            int count=0;

             for (int k=0;k<value.length();k++) {

                 if (value.substring(k,k+1).equals(""+value.charAt(i))) {
                     count++;

                 }

             }
         if(count==1) {
             unique+=""+value.charAt(i);
         }

        }
       System.out.println(unique);
  */

        //WRITE YOUR CODE HERE:
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 =scan.next();
        double price1 =scan.nextDouble();
        int count1=scan.nextInt();
        System.out.println("Enter Item2, count and its price:");
        String item2 =scan.next();
        double price2 =scan.nextDouble();
        int count2=scan.nextInt();
        System.out.println("Enter Item3, count and its price:");
        String item3 =scan.next();
        double price3 =scan.nextDouble();
        int count3=scan.nextInt();
        String report =(count1==0)?"Item2 is: "+item2+" Price: "+price2+", Item3 is: "+item3+" Price: "+price3:
                (count2==0)?"Item1 is: "+item1+" Price: "+price1+", Item3 is: "+item3+" Price: "+price3:
                        (count3==0)?"Item1 is: "+item1+" Price: "+price1+", Item2 is: "+item2+" Price: "+price2:
                                "Item1 is: "+item1+" Price: "+price1+", Item2 is: "+item2+" Price: "+price2+", Item3 is: "+item3+" Price: "+price3;
        double totalPrice =(count1==0)?count2+count3:(count2==0)?count1+count3:(count3==0)?count1+count2:count1+count2+count3;
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);

    }
}
