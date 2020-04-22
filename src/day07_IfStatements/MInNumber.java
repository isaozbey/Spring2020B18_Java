package day07_IfStatements;

public class MInNumber {

    public static void main(String [] args) {

        double a= 100   , b=200    , c=300;

        boolean aMin= a<b && a<c;

        boolean bMin= b<a &&  b<c;

        boolean cMin= c<a && c<b;

         if(aMin) {
             System.out.println("a minimun number");
         }

        if(bMin) {
            System.out.println("b minimun number");
        }

        if(cMin) {
            System.out.println("c minimun number");
        }





    }
}
