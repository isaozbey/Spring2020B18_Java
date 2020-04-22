package Individual;

import java.awt.*;

public class voidMethod {

    public static void main(String [] args) {

        myFirstMethod();
        even1to100();

        sumOfNumber(40,40);

        removeDuplicates("AABBCGHDD");

    }
     public static void even1to100() {
         for (int i = 0; i <100 ; i++) {
             if (i%2==0) {
                 continue;
             }
             System.out.print(i+" ");
         }

     }
     public static void removeDuplicates(String str) {
        String result="";
         for (int i = 0; i <str.length() ; i++) {
            if (!result.contains(""+str.charAt(i))) {
                result+=str.charAt(i);
            }
         }

         System.out.println(result);

    }

    public static void myFirstMethod() {

        System.out.println("Hello World");
        System.out.println("Hello Cybertek");
        System.out.println("Hello Khurshad");

    }

    public static void sumOfNumber(int a, int b) {

System.out.println();
        System.out.println("Sum of two numbers: "+(a+b));


    }


}
