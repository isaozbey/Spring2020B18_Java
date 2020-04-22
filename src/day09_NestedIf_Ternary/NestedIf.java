package day09_NestedIf_Ternary;

public class NestedIf {

    public  static void main(String [] args) {



        int grade=60;



        if (grade>=60) {


            System.out.println("you passed");

            if (90 <= grade && grade <= 100) {
                System.out.println("\twith an A");
            }
            else if (80 <= grade && grade <90) {
                System.out.println("\twith an B");
            }
            else if (70 <= grade && grade <80) {
                System.out.println("\twith an B");
            }
            else

                System.out.println("\twith a grade D");


        }
        else
            System.out.println("you failed");


    }


    }

