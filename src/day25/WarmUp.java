package day25;
import Resources.Library;
/*
warmup task:
    1.  write a return method that accepts a String and removes duplicate values from the String
        Ex:
                RemoveDuplicate("aaabbbccc");  ==> "abc"
    2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2 in str1 as an int
        EX:
            Frequency("AAABB", "A");  ==> 3
            Frequency("ABAB", "B"); ==> 2
    3. (This one I will do it too tomorrow in class) Combine above two methods to write a return method that can return the frequencyt of characters as a stringfrom any given string
        Ex:
            FrequencyOfChars("ABABCB"); ==> "A2B3C1";
            FrequencyOfChars("AAABCCCDD") ==> "A3B1C3D2"

 */
public class WarmUp {

    public static void main(String[] args) {

        String str= "aaabbbbbcccaaaqqqsss";
        String removedstr=Library.RemoveDuplicate (str);
        System.out.println(removedstr);



        String fruqAndRemoved=Library.RemoveFrequency( str);
        System.out.println(fruqAndRemoved);


    }
}
