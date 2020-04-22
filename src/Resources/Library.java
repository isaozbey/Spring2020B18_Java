package Resources;
import java.util.Arrays;
/*
  3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
        Ex:
            FrequencyOfChars("ABABCB"); ==> "A2B3C1";
            FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"
 */

public class Library {

    public  static String RemoveFrequency(String str) {
          String result="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {

               if (str.substring(i,i+1).equalsIgnoreCase(str.substring(j,j+1))) {
                   count++;
               }
            }
            if (!result.contains(str.substring(i,i+1))) {
                result+=str.substring(i,i+1)+count;
                str=str.replace(str.substring(i,i+1),"");
            }

        }


        return result;
    }

    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;
        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }
        return RevArr;
    }

    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";
        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }
        return  Reverse;
    }
    public static String RemoveDuplicate (String str) {

        String result="";

        for (int i = 0; i < str.length(); i++) {
            if (! result.contains(str.substring(i,i+1))) {
                result+=str.substring(i,i+1);
            }
        }

        return result;
    }


    public static String Unique (String strUnique) {
        String unique="";
        for (int i = 0; i <strUnique.length() ; i++) {
            int count=0;


            for (int j = 0; j <strUnique.length() ; j++) {

                if (strUnique.substring(i,i+1).equalsIgnoreCase(strUnique.substring(j,j+1))) {
                    count++;

                }

            }
            if (count==1) {
                unique += strUnique.substring(i, i + 1);
            }
        }

       return unique;

    }




}
