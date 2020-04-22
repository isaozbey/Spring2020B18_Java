package Individual;
public class MaxCharacter {
/*
1) How to find the maximum occurring character in given String? (solution)
Write an efficient Java/C/Python program to return the maximum occurring character in the input string, e.g., if the input string is "Java" then the function should return 'a'.
 */

        public static void main (String [] args) {
        String  sentecnce="java";
        int count=0;
        int max=-99999999;
        for (int i = 0; i < sentecnce.length(); i++) {

            for (int j = 0; j <sentecnce.length() ; j++) {

                if (sentecnce.charAt(i)==sentecnce.charAt(j)) {
                    count++;
                }

            }
            if (count>max) {
                max=count;
            }
        }


    }
}
