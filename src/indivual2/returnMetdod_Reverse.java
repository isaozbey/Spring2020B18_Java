package indivual2;

import java.util.Arrays;

public class returnMetdod_Reverse {

    public static void main (String [] args) {

        int [] list1={1,2,3,4,5,6,7};
        int [] list2 = Reverse(list1);
        System.out.println(Arrays.toString(list2));


    }

    public static int [] Reverse (int [] list) {
        int k=0;
        int [] result= new int[list.length];
        for (int i = list.length-1; i>= 0; i--) {
           result[k]=list[i];

            k++;
        }

      return result;
    }

}
