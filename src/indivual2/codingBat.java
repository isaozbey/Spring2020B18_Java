package indivual2;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class codingBat {


    public static void add_to_r(int[] r,int n)
    {
        //create new array with one more position.
        int [] arrNew=new int[n+1];

        for (int i=0; i<arrNew.length;i++) {
            arrNew[i]=r[i];
        }
        arrNew[n]=n;
        System.out.println(Arrays.toString(arrNew));
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
