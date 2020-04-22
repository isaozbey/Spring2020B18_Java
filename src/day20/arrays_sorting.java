package day20;

import java.util.Arrays;

public class arrays_sorting {
    public static void main(String [] args) {

        int[] arr= {9,8,7,6,5,4,3,2,1,0};
System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        char [] ch= {'A','C','B'};
        Arrays.sort(ch);

        System.out.println(Arrays.toString(ch));

    }
}
