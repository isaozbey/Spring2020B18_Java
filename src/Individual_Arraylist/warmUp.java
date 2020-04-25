package Individual_Arraylist;

import java.sql.Array;
import java.util.Arrays;

public class warmUp {

    public static void main(String[] args) {
        int [] arrInt={10,89,20,300,10,900,0,1,5};
        arrInt=SortDe(arrInt);
        System.out.println(Arrays.toString(arrInt));
        double [] arrDouble={10,89,20,300,10,900,0,1,5};
        arrDouble=SortDe(arrDouble);
        System.out.println(Arrays.toString(arrDouble));

        if (Arrays.equals(arrInt,arrInt)) {
            System.out.println(true);
        }

    }
    public static int [] SortDe (int [] arr) {

        Arrays.sort(arr);
        int [] arr2=new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[arr.length-1-i];
        }

        return  arr2;
    }
    public static double [] SortDe (double [] arr) {

        Arrays.sort(arr);
        double [] arr2=new double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i]=arr[arr.length-1-i];
        }

        return  arr2;
    }
}
