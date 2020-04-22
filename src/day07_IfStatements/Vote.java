package day07_IfStatements;

public class Vote {

    public static void main(String[] args) {

        int age=17;
        boolean usCitizien=true;



        boolean eligible =age>=18 && usCitizien==true;

        if (eligible) {

            System.out.println("You are eligible for vote");
        }
        if (!eligible) {

            System.out.println("You are not eligible for vote");
        }

    }
}
