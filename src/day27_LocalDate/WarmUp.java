package day27_LocalDate;

import java.util.Arrays;

/*
     1. write a return method that can return the minimum number from an int array
        2. write a return method that can return the minimum number from a double array
                    NOTE: apply method overloading,  DO NOT USE SORT METHOD.
        3. write a method that can print out the unique elements from an int array
                    Ex: {1,1,2,3,3} ==> 2
                        {6,6,7,7,8,9} ==> 8 9
        4. write a method that can print out the unique elements from a double array
                    Note: Apply method overloading
 */
public class WarmUp {

    public static void main(String[] args) {
        double [] numbers ={9,8,5,6,47,58,52,56,53,57,58,95,54,15,25};
        int minInt= (int) Minimum(numbers);
        //System.out.println(minInt);

        double minDouble= Minimum(numbers);
        //System.out.println(minDouble);
        int [] arrNum={1,1,2,3,3,4};

       Inique(arrNum);


    }

    public static int Minimum (int [] numbers) {
        Arrays.sort(numbers);
        int minNum=numbers[0];
        return minNum;
    }
    public static double Minimum (double [] numbers) {
        Arrays.sort(numbers);
        double minNum=numbers[0];
        return  minNum;
    }


    public static void Inique (int [] numbers) {

        for (int i=0; i<numbers.length;i++) {
          int count=0;

            for (int j = 0; j <numbers.length ; j++) {
               if ( numbers[i]==numbers[j]) {
                   count++;
               }

            }
            if (count==1) {
                System.out.println(numbers[i]);
            }

        }


    }

    public static void Inique (double [] numbers) {

        for (int i=0; i<numbers.length;i++) {
            int count=0;

            for (int j = 0; j <numbers.length ; j++) {
                if ( numbers[i]==numbers[j]) {
                    count++;
                }

            }
            if (count==1) {
                System.out.println(numbers[i]);
            }

        }


    }



}
