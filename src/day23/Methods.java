package day23;

import java.awt.*;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main
    public static void plus_minus(int [] array) {

        int positivies=0; int negativies=0; int zores=0;
        for (int i=0; i<array.length;i++) {
            if (array[i]>0) {
                positivies++;
            }else if  (array[i]<0) {
                negativies++;
            }else {
                zores++;
            }

        }
        System.out.println("positives:"+positivies+", negatives:"+negativies+", zores:"+zores);


    }
}
