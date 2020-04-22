package day17;

public class hexDecimal {

    public static void main (String [] args) {


        int number=480;
        String remain="";

        while (number>=16) {

          remain+=""+ (number%16);

          number=number/16;

        }
          String number1="";
         if (number==10) {
             number1=Integer.toString(number);
             number1="A";
         }else if ((number==11)) {
              number1=Integer.toString(number);
             number1="B";
         }else if ((number==12)) {
              number1=Integer.toString(number);
             number1="C";
         }else if ((number==13)) {
              number1=Integer.toString(number);
             number1="D";
         }else if ((number==14)) {
            number1=Integer.toString(number);
             number1="E";
         }else if ((number==15)) {
             number1=Integer.toString(number);
             number1="F";
         }


        remain+=number1;

         System.out.println(remain);
    }
}
