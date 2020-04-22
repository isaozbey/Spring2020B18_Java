package Individual;

import java.util.Arrays;

public class warmUp04$08 {
    public static void main (String [] args) {

        int [] arrInt= new int[100];

        for (int i = 0; i <arrInt.length ; i++) {

            arrInt [i]=i;
            if (arrInt[i]%2==0)
            System.out.print(arrInt[i] +" ");
        }


        System.out.println();

        for (int each:arrInt) {
            if (each%2!=0) {
                continue;
            }
            System.out.print(each+ " ");
        }

    }
}
