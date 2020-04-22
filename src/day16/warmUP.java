package day16;
/*
warmup tasks:
		5. Write a program that will print out all letters in English alphabet in ascending order
	6. Write a program that will print out all letters in English alphabet in descedning order
	7. write a program that can calculate the sum of all numbers between 1 to any given number
		ex:
			input: 100
			output: 5050
			input: 50
			output: 1275
			input : 200
			output : 20100
 */
         public class warmUP {
           public  static  void main (String [] args) {

        String letters ="abcdefghijklmnopqrstuvwxyz";

               for (int i = 0; i <letters.length() ; i++) {
                   //System.out.print(letters.substring(i,i+1)+" ");
                  // System.out.print(letters.charAt(i)+" ");
               }

               for (char i = 'a'; i <= 'z'; i++) {
                   System.out.print(i+" ");
               }
    }
}
