package day17;

import java.util.Scanner;

public class warmUp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result = 0;
        while (true) {


            System.out.println("Enter " + 1 + ". number");
            int number1 = input.nextInt();

            System.out.println("Enter " + 2 + ". number");
            int number2 = input.nextInt();

            System.out.println("Please select one of the operaters.( + , - , * , / , %");
            String operater = input.next();

            switch (operater) {
                case "+":
                    result = number1 + number2;
                    break;

                case "-":
                    result = number1 - number2;
                    break;

                case "*":
                    result = number1 * number2;
                    break;

                case "/":
                    result = number1 / number2;
                    break;

                case "%":
                    result = number1 % number2;
                    break;
            }

            System.out.println(result);

                System.out.println("Do you want to calculate another number");
                String answer = input.next();
                if (answer.equalsIgnoreCase("no")) {
                    break;
                } else if (answer.equalsIgnoreCase("yes")) {
                    continue;
                } else {
                    System.out.println("Invalid Entry");
                }


        }

    }
}

