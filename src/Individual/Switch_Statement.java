package Individual;

public class Switch_Statement {

    public static void main(String [] args) {

        int score=3;

        switch (score) {
            case 1:
                System.out.println("1");
                System.out.println("1");
                break;
            default:
                System.out.println("Invalid");
                 break;
            case 2:

                System.out.println("2");

                break;

        }
        String str="Java";

        switch (str) {
            default:
                System.out.println("Java programming language");

            case "C#":
                System.out.println("C# programming language");



            case "Jav":
                System.out.println("Python programming language");
                break;

        }


        char grade='C';

        switch (grade){

            case 'A':
                System.out.println("Passed with A");
                break;

            case 'B':

                System.out.println("You passed with B");
                break;
            default:
                System.out.println("You need to repeat this class");

        }

    }
}
