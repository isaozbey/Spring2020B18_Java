package day18;

public class warmUp {

    public static void main (String [] args) {

        String str="Java";
        int  inNumbers = 1;

        char [] chStr=str.toCharArray();


        int numbers=20;

        int number2=4;
        int count=0;
        while (numbers>=number2) {

            numbers=numbers-number2;
            count+=1;
        }

        System.out.println(count);

    }


}
