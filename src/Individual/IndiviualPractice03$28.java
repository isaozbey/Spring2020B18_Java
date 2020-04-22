package Individual;

public class IndiviualPractice03$28 {

    public static void main (String [] args) {

        /*
        String  str="xxyyzz";
        String result="";

        for (int i=0; i<str.length(); i++) {


            if (! result.contains(""+ str.charAt(i))) {

              result+=str.charAt(i);
            }
        }
        System.out.println(result);

      String sentence="I love books, I like books, I buy books, I hate books";
      int count=0;
      for (int i=0; i<sentence.length()-4;i++) {

          if (sentence.substring(i,i+4).equals("book")) {
             count++;
          }
      }
      System.out.println(count);  */

        /*String sentence="I love books, I like books, I buy books, I hate books";

        int i=0, count=0;
        while (i <sentence.length()-3) {

            if (sentence.substring(i,i+4).equals("book")) {
                count++;
            }
            i++;

        }
        System.out.println(count); */
        /*
        int i=0;
        int result=0;

        while (i<=100) {

            if (i%2==0) {
                System.out.print(i+" ");
                result+=i;
            }
            i++;

        }
        System.out.println("");
        System.out.println(result); */
        int i=0;
        int result=0;
        do {

           if(i%2==0) {
               System.out.print(i+" ");
               result+=i;
           }
            i++;
        }while (i<=100);


    }
}
