package day08_IfStatements;

public class EqualNumber_MultiBranchIF {

    public  static void main(String[] args ) {


        double n1=10.5 , n2=100.0 , n3=100.5;

        boolean n1Equaln2= n1==n2 &&n1!=n3;

        boolean n1Equaln3 = n1==n3 && n1!=n2;

        boolean n2Equaln3= n2==n3 && n2!=n1;

        boolean allEqual =  n1==n2 && n2==n3;

        boolean noneOFThemEqual = n1!=n2 && n1!=n3 && n2!=n3 ;

        String result="";
        if(n1Equaln2) {

           String result1="n1 is equal to n2 ";

        } else if (n1Equaln3) {

            result="n1 is equal to n3 ";
        }
        else if (n2Equaln3){

            result="n2 is equal to n3 ";
        }
        else if(allEqual){
           result="All number are equal ";
        }
        else
            result="None of them are equal";


        System.out.println(result);


    }
}
