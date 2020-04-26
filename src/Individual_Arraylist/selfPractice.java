package Individual_Arraylist;
public class selfPractice {
    public static void main(String[] args) {
        String str="AAABBCCCDD";
        Combined(str);
    }
    public static String RemDup(String str) {
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            if (!result.contains(""+str.charAt(i))) {
                result+=""+str.charAt(i);
            }
        }
        return result;
    }
    public static String  Apprence(String str) {
          String result="";

        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            result+=count+" ";
        }
        return  result;
    }
    public static void Combined(String strLetter) {
        String remDup=RemDup(strLetter);
        String  strNum=Apprence(strLetter);

    }
}
