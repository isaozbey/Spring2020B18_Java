package Individual;

import java.util.Scanner;

public class IndiviualPractice04$01_1 {
    public  static void main (String []args){

        /*
        int array1[]= {1,2,3};
        int array2[]= {4,5,6};

        int [] arrya3= new int[array1.length+array2.length];

        for (int i=0; i<array1.length;i++) {
            arrya3[i]=array1[i];

        }
        for (int k=0;k<array2.length;k++) {
            arrya3[k+array1.length]=array2[k];
        }
        for (int z=0; z<arrya3.length;z++) {
            System.out.println(arrya3[z]);
        }
 */

        Scanner scan= new Scanner(System.in);
         int sum=0;
        int [] array= new int[5];

        for (int i=0;i<array.length;i++) {
            System.out.print("enter "+i+".number:");
            array[i]=scan.nextInt();
            sum+=array[i];
        }

  System.out.println(sum);
    }
}
