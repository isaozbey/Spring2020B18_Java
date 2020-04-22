package indivual2;

import java.util.Scanner;

public class Bgd {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Number");
        int number1=input.nextInt();
        System.out.println("Enter Second Number");
        int number2=input.nextInt();

        int gcn=Greatest(number1,number2);
        System.out.println("Greatest Common Divisor : "+gcn);
    }

    public static int Greatest(int n1, int n2) {
        int k=1;
        int divider=1;
        while (k<=n1 & k<=n2) {
            if (n1%k==0 && n2%k==0) {
                divider=k;
            }



            k++;
        }
      return divider;
    }

}
