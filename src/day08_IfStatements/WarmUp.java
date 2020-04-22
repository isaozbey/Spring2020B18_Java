package day08_IfStatements;

public class WarmUp {
    public static void main (String [] args ){

        double n1=100.5 , n2=100.5 , n3=100.5;

       boolean n1Equaln2= n1==n2 &&n1!=n3;

       boolean n1Equaln3 = n1==n3 && n1!=n2;

       boolean n2Equaln3= n2==n3 && n2!=n1;

       boolean allEqual =  n1==n2 && n2==n3;

       boolean noneOFThemEqual = n1!=n2 && n1!=n3 && n2!=n3 ;

       if (n1Equaln2)
           System.out.println("n1 is equal to n2");

       if (n1Equaln3)

           System.out.println("n1 is equal to n3");

       if(n2Equaln3)

           System.out.println("n3 is equal to n2");

       if (allEqual)
           System.out.println("All of them are equal");

       if(noneOFThemEqual)
           System.out.println("None of them equal");


    }
}
