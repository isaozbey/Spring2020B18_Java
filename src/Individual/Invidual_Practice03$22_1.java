package Individual;


import java.util.Scanner;

public class Invidual_Practice03$22_1 {

    public static void main (String [] args) {


         String str="xxyyzz";
         String result= "";

     /*    String result =" ";

         for (int i=0; i<str.length();i++) {

            if ( !result.contains(str.substring(i,i+1))) {
                result += str.substring(i, i + 1);
            }

         }

         System.out.print(result);
*/

         for (int i=0; i<str.length();i++) {

             if(str.charAt(i)!=str.charAt(i+1)) {
                 result+=""+str.charAt(i);

             }
         }
      System.out.println(result);
    }
}
