package day08_IfStatements;

public class MultiBrancIF {

    public  static void main(String[] args ) {

        int a=-100;

        boolean zero = a==0;
        boolean negative=a<0;
        boolean positive=a>0;

        if (zero) {
            System.out.println("zero");
        }

        else if (negative){

            System.out.println("NEGATIVE");
        }
        else
            System.out.println("POSITIVE");




        //========================================================================================================================


    }
}
