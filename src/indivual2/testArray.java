package indivual2;

import java.util.Arrays;

public class testArray {
    public static void main(String[] args) {

        int [] number= {5,6,8,9,7,4,7,1,2,3};
        int [] unsorted= new int[number.length];



        for (int i = 0; i <number.length ; i++) {
          unsorted[i]=number[i];
        }


        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(unsorted));


    }
}
