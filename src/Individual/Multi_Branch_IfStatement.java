package Individual;

public class Multi_Branch_IfStatement {

    public  static  void main (String [] args) {
       int grade=95;

      if (grade>=90) {
          System.out.println("you made A");
      }

        else if (grade<90 && grade>80) {
            System.out.println("You made B");
        }

      else if (grade<80 && grade>=70) {
          System.out.println("You made B");
      }

      else if (grade<70 && grade>=60) {
          System.out.println("You made B");
      }
        else
            System.out.println(("You made F, "));


        int hour =12;

        if (hour>=0 && hour<12) {
            System.out.println("Good Morning");
        }

        else if (hour>12 && hour<=15) {
            System.out.println("Good Afternoon");
        }

        else if (hour>15 && hour<=23) {
            System.out.println("Goog night");
        }
        else
            System.out.println("good noon");




        int num1=200, num2=300,  num3=50;

        if (num1>num2 &&num1>num3) {
            System.out.println(num1 +" is the bigger number");
        }
        else if (num2>num1 &&num2>num3) {
            System.out.println(num2+ " Is bigger number");
        }
        else if(num3>num1 &&num3>num2) {
            System.out.println(num3 +" is the bigger nuumber");
        }

        else if (num3==num2 && num1>num2) {
            System.out.println(num1 +" Is the bigger number");
        }

        else if (num1==num2 && num3>num2) {
            System.out.println(num3 +" Is the bigger number");
        }
        else if (num3==num1 && num2>num1) {
            System.out.println(num2 +" Is the bigger number");
        }
        else

            System.out.println("All number are equal");


        if(true)
            System.out.println("if block");
        else if(true)
            System.out.println("if block");
        else
            System.out.println("Else block");
}
}
