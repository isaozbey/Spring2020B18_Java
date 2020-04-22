package Individual;

public class fruquencyChar {
    public static void main(String [] args) {


        String word="XXXYYYZZZ"; // X3Y3Z3

        //frrequency(word);
        frequancy2(word);
    }

    public static void frequancy2(String word) {
        String result="";
        for (int i = 0; i <word.length() ; i++) {
           int count=0;
            for (int j = 0; j <word.length() ; j++) {

                if (word.charAt(i)==word.charAt(j)) {
                   count++;

                }

            }
            result+=""+word.charAt(i)+count;
            word=word.replace(""+word.charAt(i),"");
        }
        System.out.println(result);

    }


    public static void frrequency(String word) {
        String result="";
        for (int i = 0; i <word.length() ; i++) {

            if (!result.contains(""+word.charAt(i))) {
               result+=word.charAt(i);
            }

        }
        System.out.println(result);

        String result2="";
        for (int i = 0; i <result.length() ; i++) {
            int count=0;
            for (int j = 0; j <word.length(); j++) {
                if (result.charAt(i)==word.charAt(j)) {
                    count++;
                }

            }
            result2+=""+result.charAt(i)+count;
        }
        System.out.println(result2);
    }



}
