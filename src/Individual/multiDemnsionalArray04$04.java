package Individual;

import java.util.Arrays;

public class multiDemnsionalArray04$04 {
    public static void main (String []args) {

      char [] [] chr2D= { {'A','B'},{'C','D'}    };


      for (int i=0; i<chr2D.length;i++) {

          for (int k=0;k<chr2D[i].length;k++) {

              System.out.print(chr2D[i][k]+",");
          }

      }



    }
}
