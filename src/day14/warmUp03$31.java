package day14;

public class warmUp03$31 {
    public static void main(String[] args ) {

      /*String input4= "one";
      String input2="two";

      String result="";

      result=input.concat(input2).concat(input).concat(input2);
      System.out.println(result);  */



        String input1="apple";
        String input2="banana";

        System.out.println(input1.substring(1,input1.length()-1)+input2.substring(1,input2.length()-1));

        String input="elephan";


        if (input.length()%2==0) {

            System.out.println(input.substring(input.length()/2-1,input.length()/2+1));
        }else
           // System.out.println(input.substring(input.length()/2,input.length()/2+1));
               System.out.println(input.charAt(input.length()/2));

   //third
    }
}
