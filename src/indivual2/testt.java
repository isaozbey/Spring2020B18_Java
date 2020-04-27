package indivual2;
import java.util.Arrays;
import java.util.Scanner;
public class testt {

    public static void main(String[] args) {


        int [] numbers= {1,5,8,7,4,5,8,9,3,2};

        int [] unSort=numbers;
          Arrays.sort(numbers);
          System.out.println(Arrays.toString(numbers));
          System.out.println(Arrays.toString(unSort));

       if ( Arrays.equals(unSort, numbers)) {
           System.out.println(true);
        }else {
           System.out.println(false);
       }


    }

    public static int[] mergR(int[] a,int[] b) {

        int [] arrMerg= new int [a.length+b.length];

        for (int i=0; i<a.length;i++) {
            arrMerg[i]=a[i];
        }
        for (int i=0; i<b.length;i++) {
            arrMerg[a.length+i]=b[i];
        }
        return arrMerg;

    }


    public static boolean appearsTwice(String target, String sentence) {
        sentence=sentence.replace(",","");
        String [] arrSentence = sentence.split(" ");
        int count=0;
        for (String each:arrSentence) {
            if (each.equals(target)) {
                count++;
            }
        }
        if (count>1) {
            return true;
        }
        return false;
    }

    
}
