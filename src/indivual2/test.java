package indivual2;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    /*
    1.  write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods
2.  Write a program that can print out the unique values from an int Array
        Ex:
            if arr -> {1,1,2,3,3}
            output: 2
            if arr -> {1,2,2,3,4,4}
            output:  1  3
3. Write a program that can print out the unique values from  String Array

     */

    public static void main(String[] args) {

        String str1="aabbcc"; //aabbcc
        String str2="cab";
        String result1="";
        String result2="";

        for (int i = 0; i <str1.length() ; i++) {

          if (!result1.contains(str1.substring(i,i+1))) {
              result1+=str1.substring(i,i+1);
          }

        }
        for (int i = 0; i <str2.length() ; i++) {

            if (!result2.contains(str2.substring(i,i+1))) {
                result2+=str2.substring(i,i+1);
            }

        }
        System.out.println(result1);
        System.out.println(result2);

        String [] strArr1=result1.split("");
        String [] strArr2=result2.split("");

        Arrays.sort(strArr1);
        Arrays.sort(strArr2);
        System.out.println(Arrays.toString(strArr1));
        System.out.println(Arrays.toString(strArr2));
        boolean fResult=Arrays.equals(strArr1,strArr2);
        System.out.print(fResult);



    }
}
