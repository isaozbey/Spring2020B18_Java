package day14;

import java.util.Scanner;

public class practice03$31 {
    public static void main(String[] args ) {
   /*
you have 2 words that must be 5 characters, and check if last letter of first word and first letter of second work are same.
		if either one not 5 chars length:    print "need to be exactly 5 chars length"
		if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
		if they do not match:  print "Buzz - did not match"

    */
      /*  Scanner input= new Scanner(System.in);

        System.out.println("Enter your first name:");
        String word1=input.next();

        System.out.println("Enter your second name:");
        String word2=input.next();

        System.out.println("Enter your third name:");
        String word3=input.next();


        int length1=word1.length();
        int length2=word2.length();
        int length3=word3.length();

        if (length1==length2 && length2==length3 ) {

            System.out.println("All words are same length");

        }else if (length1!=length2 && length2!=length3 && length1!=length3) {
            System.out.println("All diffent are length");
        }else {
            System.out.println("Not same nor different length");
        }
            */

        Scanner input= new Scanner(System.in);

        System.out.println("Enter your first name:");
        String word1=input.next();

        System.out.println("Enter your second name:");
        String word2=input.next();
        word1.substring(0,1).toUpperCase();
        if(word1.length()==5 && word2.length()==5) {

            if (word1.charAt(word1.length() - 1) == word2.charAt(0)) {

                System.out.println("Fizz");
            }else {
                System.out.println("Buzz");
            }
        }else {
            System.out.println("need to be exactly 5 chars length");
        }
        String word3="aok";
        String word4="kol";
        System.out.println(""+word3.charAt(0)+word4.charAt(0));







    }
}
