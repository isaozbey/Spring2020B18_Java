package Individual;

public class IndiviualPractice03$29 {

    public static void main (String [] args) {

        /* if (i%3==0 && i%5==0) {
                result+="FINRA ";
         }else if (i%3==0) {
             result+="FIN ";
         }else if (i%5==0) {
             result+="RA ";
         }else {
             result+=i+ " ";
               }





        int i=1;
        String result="";

     do {

         result+=(i%3==0 && i%5==0)? " FINRA " :(i%3==0) ? "FIN " :(i%5==0) ? "FIN ": i+ " ";


          i++;

     } while (i<=30);
     System.out.println(result);

 */

        /*String input="lavvvvbvel";

        for (int i = 0; i <input.length()-1 ; i++) {

            if (input.charAt(i)==input.charAt(input.length()-1) && input.charAt(i+1)==input.charAt(input.length()-2)) {
                System.out.println(true);

            }
        }

*/


        /*for (int i = 0; i <5 ; i++) {

            for(int k=0; k<5;k++) {
                System.out.print('*');
            }
            System.out.println();
        } */


        /*for (int i=1; i<=7; i++) {

            for (int k=1; k<=i;k++) {
              System.out.print("*");
            }
            System.out.println("");
        } */

         /* int i =1;

        while (i<=7) {
            int k=1;
            while (k <=i) {
                System.out.print("*");
                k++;
            }

            System.out.println("");
            i++;
        }

          */

        for (int i = 1; i <=6 ; i++) {

            for (int k=6; k>=i;k--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
