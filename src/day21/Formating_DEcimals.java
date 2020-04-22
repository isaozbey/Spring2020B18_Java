package day21;

import java.text.DecimalFormat;

public class Formating_DEcimals {

    public static void main(String [] args) {

        DecimalFormat DF= new DecimalFormat("0.0000");
         double a=10.0/3.0;
         System.out.println(DF.format(a));


    }
}
