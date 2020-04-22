package day23;

import java.util.Arrays;

/*
    1. write a method that can print all odd number between 1 ~ 100
	2. write a method that can print all even number between 1 ~ 100
    4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */
public class homework {

    public static void main(String[] args) {
   oddNumber(100);
   System.out.println();
   evenNumber(100);
   System.out.println();
    int [] arr={85,98,65,58,47,42,45,65,21,15,95,75,35};
    Reverse(arr);
    System.out.println();
    MaxArray(arr);
    MinArray(arr);
    }


    public static void Reverse (int [] array3) {
            int [] result=new int[array3.length];
        for (int i = 0; i<array3.length ; i++) {

            result[i]=array3[array3.length-1-i];
        }
        System.out.print(Arrays.toString(result));
    }

    public  static void MinArray (int [] array2) {
        Arrays.sort(array2);
        System.out.println("Minimum number is : "+array2[0]);

    }
    public static void MaxArray(int [] array) {
        Arrays.sort(array);
        System.out.println("Maximum number is : "+array[array.length-1]);
    }



    public static void evenNumber(int n) {
        int i=1;
        String result ="";
        while (i<=n) {

            if (i%2==0) {
                result+=i+" ";
            }
            i++;
        }
        System.out.print(result);

    }

    public static void oddNumber(int n) {
        int i=1;
        String result ="";
        while (i<=n) {

            if (i%2!=0) {
                result+=i+" ";
            }
            i++;
        }
        System.out.print(result);

    }


}
