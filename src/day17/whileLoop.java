package day17;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class whileLoop {
    public static void main (String [] args) {
        Random rand= new Random();
   int maxNumber=-999999999;

   int [] list={1,2,4,85,69,65,25,85,75,48,68,93,38,18};
     int [] numbers= new int[10];

        for (int i = 0; i <numbers.length ; i++) {

           numbers[i]=rand.nextInt(100);

            System.out.print(numbers[i]+" ");

            if (maxNumber<numbers[i]) {
                maxNumber=numbers[i];
            }

        }
        System.out.println();
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        System.out.println(maxNumber);
    }
}
