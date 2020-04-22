package Individual;

import java.util.Scanner;

public class IndiviualPractice04$01 {

    public  static void main (String []args){
        Scanner input= new Scanner(System.in);

        int [] number= {12,25,-85,-89,89,96};


         int maxNum = 0;
         int secondMax=0;


            for (int k=0;k<number.length;k++) {

                if (number[k]>maxNum) {
                    maxNum=number[k];

                }


                for (int z=0; z<number.length;z++) {

                    if( number[z] > secondMax && number[z]!=maxNum ){
                        secondMax=number[z];

                    }
                }




            }
            System.out.println(maxNum);
        //}




    }
}
