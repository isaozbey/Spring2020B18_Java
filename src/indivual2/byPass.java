package indivual2;
import java.util.Scanner;
import java.util.Arrays;
public class byPass {


    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
        int [] arrNum=new int[n+2];

        for (int i = 0; i <r.length ; i++) {
            arrNum[i]=r[i];
        }
       System.out.println(arrNum.length);
        System.out.println(Arrays.toString(arrNum));
    }

    public static void main(String[] args) {


        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(),n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);


    }
}
