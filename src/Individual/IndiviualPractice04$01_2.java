package Individual;

import java.util.Arrays;

public class IndiviualPractice04$01_2 {
    public  static void main (String []args) {


        /*
        int [] arr={1,1,2,2,3,3};


        for (int i = 0; i <arr.length ; i++) {
            int count=0;

            for (int k=0;k<arr.length;k++) {
                if (arr[k]==arr[i]) {
                    count++;
                }
            }
            if (count==1) {
                System.out.println(arr[i]);
            }

        }
*/
         /*
        String[] arryString = {"one","one","two","two","Jose"};

        for (int i = 0; i < arryString.length; i++) {
            int count = 0;
            for (int k = 0; k < arryString.length; k++) {

                if (arryString[k].equals( arryString[i])) {
                    count++;
                }
            }

            if (count==1) {
                System.out.println(arryString[i]); }
        }
        String  str= Arrays.toString(arryString);
        System.out.println(str);
*/


         int [] numbers={23,58,56,52,47,89,789,963,321,147,159,753};
         int [] numbers2=new int[numbers.length];

         Arrays.sort(numbers);

         String result="[";
         int z=0;
        for (int i = numbers.length-1; i >=0; i--) {
                  numbers2[z]=numbers[i];

                  z++;
        }
            System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));
        double totaltip=34.45;
        double numberofpeople=4;
        System.out.println("Tip per person: "+totaltip/numberofpeople);
        }

    }





