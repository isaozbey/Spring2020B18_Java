package day17;

public class Warm2 {

    public static void main (String [] args) {

        int k=1;
        String primeNumbers="";

        while (k<=50) {
            int count=0;

            for (int i = 1; i <=50 ; i++) {

                if (k%i==0) {
                    count+=1;
                }
            }

            if (count==2) {
                primeNumbers+=k+" ";
            }

            k++;
        }

        System.out.println(primeNumbers);
    }

}
