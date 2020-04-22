package day03_VariablesContinue;

public class SalaryCalculator {

    public static void main(String[] args) {

        int  x =  10;

        int  y =  x++;
        System.out.println(y);

        System.out.println( y++  + "  " +  x++  + "  " + y);
    }


}
