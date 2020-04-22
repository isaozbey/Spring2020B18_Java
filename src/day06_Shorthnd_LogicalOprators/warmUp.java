package day06_Shorthnd_LogicalOprators;



public class warmUp {


    public static void main(String [] args) {

      int numb1=47, numb2=49, numb3=48;

      if (numb1>numb2 && numb1<numb3 || numb1>numb3 && numb1<numb2) {

          System.out.println(numb1 +" is medium number");
      }

        if (numb2>numb1 && numb2<numb3 || numb2>numb3 && numb2<numb1) {

            System.out.println(numb2 +" is medium number");
        }

        if (numb3>numb2 && numb3<numb1 || numb3>numb1 && numb3<numb2) {

            System.out.println(numb3 +" is medium number");
        }


            }
}
