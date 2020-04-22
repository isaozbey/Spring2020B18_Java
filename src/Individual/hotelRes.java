package Individual;

import java.util.Scanner;

public class hotelRes {
    public static void main (String [] args) {

        String result = "";
        int vCount = 0;
        int hCount = 0;
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 11; j++) {
                    if (j % 2 != 0) {
                        System.out.print("   ");
                        continue;
                    } else {
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            } else {
                for (int j = 0; j < 11; j++) {
                    if (j % 2 == 0) {
                        System.out.print("   ");
                        continue;
                    } else {
                        System.out.print(" * ");
                    }
                }
                System.out.println();
            }
        }




    }
}
