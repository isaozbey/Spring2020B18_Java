package day09_NestedIf_Ternary;

public class ageGroups {



    public static void main(String [] args) {

        short age=125;
        String result=" ";
        if(age<3 && age>0) {
            result="infants";

        }

        else if(age>=3 && age<=5) {
            result="Toddler";

        }

        else if(age>=6 && age<=9) {
            result="Kid";

        }

        else if(age>=10 && age<=12) {
            result="Pre-Teen";

        }

        else if(age>=13 && age<=17) {
            result="Teenager";

        }

        else if(age>=18 && age<=20) {
            result="Young Adult";

        }

        else if(age>=21 && age<=39) {
            result="Adult";

        }

        else if(age>=40 && age<=49) {
            result="Young Middle-Aged Adult";

        }

        else if(age>=50 && age<=54) {
            result="Middle-Aged Adult";

        }

        else if(age>=55 && age<=64) {
            result="Very Young Senior Citizien ";

        }

        else if(age>=65 && age<=74) {
            result="Young Senior Citizien ";

        }

        else if(age>=75 && age<=84) {
            result="Senior Citizien ";

        }


        else if (age<=85 &&age<=120){
            result="Old Senior Citizien ";

        }

        else  {
            System.out.println("Invalid Entry");
        }


            System.out.println(result);
        }
    }



