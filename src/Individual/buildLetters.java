package Individual;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;

public class buildLetters {
    public static void main (String [] args) {

         String str1="aabbbc";
         String  str2="cacbabcabcb";

         String result="";
        for (int i = 0; i <str1.length() ; i++) {

            if (! result.contains(""+str1.charAt(i))) {
               result+=str1.charAt(i);
            }
        }


        String  result2="";
        for (int i = 0; i <str2.length() ; i++) {
            if (! result2.contains(str2.substring(i,i+1))) {
                result2+=str2.substring(i,i+1);
            }

        }

             char [] chrForR=result.toCharArray();
              Arrays.sort(chrForR);
              //System.out.println(Arrays.toString(chrForR));

              String [] arrR2=result2.split("");
              Arrays.sort(arrR2);
              System.out.println(Arrays.toString(arrR2));












    }
}
