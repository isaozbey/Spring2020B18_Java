package Individual;

import java.util.Scanner;

public class testBreak {
    public static void main (String [] args) {
    /*
        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {

                if (i*j>2) {
                    break;
                }
                System.out.println(i*j);
            }

        }
      */
      /*
        Scanner input= new Scanner(System.in);
        String word=input.next();
        int length=word.length()-1;
        int i=0;
        boolean result=true;
        while (i<length) {

            if (word.charAt(i)!=word.charAt(length)) {
                result=false;
                break;
            }
             i++;
            length--;

        }

       if (result) {
           System.out.println("It is palindrome");
       }else {
           System.out.println("it is not");
       }


*/
      /*

   Scanner input= new Scanner(System.in);

   String reverse="";

   String  word= input.next();

        for (int i = word.length()-1; 0 <=i ; i--) {

            reverse+=""+word.charAt(i);

        }
      if (word.equals(reverse)) {
          System.out.println("it is palindroma");
      }else {
          System.out.println("it is bir boq");
      }

*/
        /*

        Scanner input= new Scanner(System.in);

        //String reverse="";

        String  word= input.next();
      int k=word.length()-1;

      String reverse2="";

      while (0<=k) {
          reverse2+=""+word.charAt(k);
          k--;
      }
        if (word.equals(reverse2)) {
            System.out.println("it is palindroma");
        }else {
            System.out.println("it is bir boq degil");
        }*/
        

        int count=0;


        String str= "a";

        String result=str+count;

        System.out.println(result);

    }


}

