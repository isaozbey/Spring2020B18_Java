package Individual;

import java.util.Scanner;

public class xXstringMethods {
    public static void main (String []args) {
        Scanner scan= new Scanner(System.in);

        String word=scan.nextLine();
        String  result="";
         for (int i=0; i<word.length();i++) {

             if (word.substring(i,1).equals("x") || word.substring(0,1).equals("X") || word.substring(word.length()-1).equals("x") ||word.substring(word.length()-1).equals("X") ) {
                 continue;
             }

            result+=""+word.charAt(i);
        }

     System.out.println(result);
    }
}
