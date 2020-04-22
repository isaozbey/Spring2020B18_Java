package day07_IfStatements;

public class MediumNumber {

    public static void main(String [] args)  {

        double a=100, b=20,  c=300;

        boolean aMedium = (a<b && a>c) || (a>b && a<c) ;

        boolean bMedium = (b<c && b>a) || (b<a && b>c);

        boolean cMedium = (c>a && c<b) || (c>b && c<a);

        if (aMedium) {

            System.out.println(a +" A medium number");
        }

        if (bMedium) {

            System.out.println(b +" B medium number");
        }

        if (cMedium) {

            System.out.println(c +" C medium number");
        }

    }
}
