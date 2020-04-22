package indivual2;

import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

public class CountLettersInArray {

    public static void main(String [] args) {

        int [] list ={1,2,3,4,5,6,7,8,9};


        for (int i = 0; i <list.length ; i++) {
          System.out.print(list[i]+" ");
        }


    }

    public static void reverse(int [] list) {

        int [] newList= new int[list.length];

        for (int i = 0; i <list.length ; i++) {
            newList[i]=list[list.length-1-i];

        }
       list=newList;
     //System.out.print(Arrays.toString(newList));
        System.out.println();

    }



}
