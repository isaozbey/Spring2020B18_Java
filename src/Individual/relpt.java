package Individual;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class relpt {

    public static void main(String[] args) {
     boolean result=appearsTwice("laptop","I would like to buy a new laptop, because my laptop is too old.");
      System.out.println(result);
      String  str="I would like to buy a new laptop, because my laptop is too old.";
      String [] list =str.split(" ");
      System.out.println(Arrays.toString(list));
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
        if (count==2) {
            return true;
        }
        return false;
    }


}

