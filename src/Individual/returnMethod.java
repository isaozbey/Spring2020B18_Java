package Individual;

import java.util.Arrays;

public class returnMethod {
    public static void main(String [] args) {
       // name();
          System.out.println(name());
          String str1=name();
          System.out.println(str1);

          System.out.println(Addition(10,20));
          int num=Addition(20,30);
          System.out.println(num);

          System.out.println(numbers(10,30,40));

          int [] arr={20,90,1,2,3,5,9};
          int maxNum=maximum(arr);
          System.out.println(maxNum);


          int [] arr2={1000,9000,8000,85222,35748};
          int max2=maximum(arr2);
          System.out.println(max2);

          String [] names = {"okkes","osman","mahmutt","kamilcan"};
          String lname=longestString(names);
          System.out.println("longets name is: "+lname);



          int [] array= {1,5,7,9,6,5,4,45,75,58,};
          array=Sort(array);
          System.out.println(Arrays.toString(array));

    }

    public static int [] Sort (int [] arr) {
        int [] sorted= new int[arr.length];
        Arrays.sort(arr);
        int z=0;
        for (int i = arr.length-1; i>=0 ; i--) {
          sorted[z]=arr[i];
            z++;
        }

        return sorted;
    }






    public static String longestString(String [] strArr) {
         int maxname=strArr[0].length();
         String maxLname="";
        for (int i = 0; i <strArr.length ; i++) {
            if (maxname<strArr[i].length()) {
                maxname=strArr[i].length();
                maxLname=strArr[i];
            }
        }
        return maxLname;
    }





    public static int maximum(int [] arr) {
      Arrays.sort(arr);
        return arr[arr.length-1];
    }















    public static String name() {

        return "ozbey";
    }

    public  static  int Addition(int a, int b) {

        return a+b;
    }

    public static int numbers(int a, int b, int c){
        int [] arr={a,b,c};
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

}
