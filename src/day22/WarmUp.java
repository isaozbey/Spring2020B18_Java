package day22;

import java.lang.reflect.Array;
import java.util.Arrays;
import  java.util.Scanner;
public class WarmUp {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        while (true) {
            for (int each : inhabitants) {
                each = each / 2;
                System.out.print(each + " ");
            }
        }

    }
}
