package Individual;

import java.util.Scanner;

public class calculationWithParameters {

    public static void main(String [] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number");
        int num1=input.nextInt();
        System.out.println("Enter second number");
        int number2=input.nextInt();
        System.out.println("Enter an operator[-,+,*,/,%]");
        String  operator=input.next();

        Calculation(num1,number2,operator);

    }



    public static void Calculation(int number1,int number2, String operator) {
        double result=0;

        switch (operator) {
           case "+":
               result=number1+number2;
               break;
           case "-":
               result=number1-number2;
               break;
           case "*":
               result=number1*number2;
               break;
           case "/":
               result=number1/number2;
               break;
           case "%":
               result=number1%number2;
               break;
           default:
               System.out.println("Invalid Operator");


       }

        System.out.println(result);

    }
}
