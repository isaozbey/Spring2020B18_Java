package day07_IfStatements;

public class MaxNumber {

    public static void main(String [] args) {

        double a= 100   , b=200    , c=300;

        boolean aGreater = a>b && a>c;

        boolean bGreater = b>a && a>c;

        boolean cGreater= c>a  && c>b ;

        if (aGreater) {

            System.out.println(a +" a Is greater number");
        }

        if (bGreater) {

            System.out.println(b +" b Is greater number");
        }

        if (cGreater) {

            System.out.println(c +" c Is greater number");
        }
    }
}
