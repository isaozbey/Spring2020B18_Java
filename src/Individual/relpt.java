package Individual;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class relpt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        String[] words2=new String[words.length];

        //TODO: Write your code below
        for (int i=0; i<words.length;i++) {
            words2[i]=words[i].substring(0,1)+words[i].substring(words[i].length()-1);


        }
        System.out.print(Arrays.toString(words2));
    }

    }
