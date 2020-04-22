package Individual;

import java.awt.*;

public class IndiviualPractice03$27 {

    public  static void main (String []args){


       for (int i = 1; i <=10; ++i) {
            int result= i*i;

            System.out.println("Square of "+i+" is "+ result);
            
        }



        /*for (int i = 1; i <=32 ; i++) {


            if (i%2==0) {
                System.out.print(i+" ");

            }
            System.out.println();

            if (i%2!=0) {
                System.out.print(i+" ");

            }




        }

*/

        String  str="Java";
        String result=" ";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);

        }
        System.out.print(result);

    }
}
