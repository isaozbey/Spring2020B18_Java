package indivual2;

import java.util.ArrayList;
import java.util.Scanner;
public class dayReview {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE
        int [] arr=new int[Integer.MAX_VALUE];

        arr[0]=0; arr[1]=1;
        for (int i=2;i<arr.length;i++) {
            arr[i]=arr[i-2]+arr[i-1];

            if (arr[i]==num) {
                System.out.println(i);
                break;
            }



        }

    }

}
