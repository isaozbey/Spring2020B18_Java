package Individual;
import java.util.Arrays;
public class replt {
    public static void main(String[] args) {

        String result=at3("blablah","test");
        //System.out.println(result);
        String str="Nurses Run";
        boolean result1=isPalindrome(str);
        //System.out.println(result1);
        String word1="listen";
        String word2="silent";
        boolean b=isAnagram(word1, word2);
        System.out.println(b);

    }


    public static String at3(String target,String word){
        String part1=target.substring(0,3)+word+target.substring(4);

        return part1;
    }


    public static int finfMax(int [] numbers) {
        int max=0;
        Arrays.sort(numbers);
        max=numbers[numbers.length-1];
        return max;
    }
    public static double finfMax(double [] numbers) {
        double max=0;
        Arrays.sort(numbers);
        max=numbers[numbers.length-1];
        return max;
    }


    public static int[] mergR(int[] a,int[] b) {
        int [] merged=new int[a.length+b.length];
        for (int i=0;i<a.length;i++) {
            merged[i]=a[i];
        }
        for (int k=0;k<b.length;k++) {
            merged[a.length-1+k]=b[k];
        }
        return merged;

    }

    public static boolean isPalindrome(String check) {
        check=check.trim();
        System.out.println(check);
        String reversed="";
        boolean result=false;

        for (int i=check.length()-1;i>=0;i--) {
            reversed+=check.charAt(i);
        }
        if (reversed.equalsIgnoreCase(check)) {
            result=true;
        }else {
            result=false;
        }
        return result;
    }

    public static boolean isAnagram(String word1, String word2) {
        boolean result=false;
        String [] arrWord1=word1.split("");
        String [] arrWord2=word2.split("");

        Arrays.sort(arrWord1);
        Arrays.sort(arrWord2);

        if (Arrays.equals(arrWord1,arrWord2)) {
            result=true;
        }else {
            result=false;
        }
        return result;
    }





}
