package day19;
public class warmUp {
    /*

     1. write a program that can return the unique characters from a string
        Ex:  "AABCC" ==> "B"
        2. write a program that can return the frequency of the characters ina string
		Ex: "AABCBCA" ==> "A3B2C2"
     */

    public static void main(String [] args) {


    String str="AABCC" ;
        String result="";
        for (int i = 0; i <str.length(); i++) {
            if (!result.contains(""+str.charAt(i))) {
                result += ""+str.charAt(i);
            }

        }




         String fResult="";
        for (int i = 0; i <result.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i)==str.charAt(j)) {
                    count++;

                   }
            }
            fResult+=""+result.charAt(i)+count;
        }
       System.out.println(fResult);
    }
}
