package day26;

public class WarmUp {
    /*
    Warmup tasks:
    1. write a return method called frequency that accepts two parameters: string str and char ch,
        the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop
    2. use the above method to create another called uniques that accepts a string paramter and returns it's unique characters as String
            Ex: uniques("ABBC");      ==> "AC"
                uniques("Cybertek");      ==> "cybrtk"

     */
    public static void main(String[] args) {
        String str="AAA";
        char ch ='A';
        char [] arr=str.toCharArray();

        int sum=Frequncey(arr,ch);
        System.out.println(sum);

        System.out.println("=======================================");
        String name="cybertek";
        String uniquedName=Unique(name);
        System.out.println(uniquedName);
    }



    public static int Frequncey(char [] str, char  ch) {
        int count=0;
       for (char each:str) {
           if (each==ch) {
               count++;
           }
       }
        return count;
    }

    public static String Unique (String name) {
        String  result="";

        for (int i = 0; i <name.length() ; i++) {
            int count=0;
            for (int j = 0; j < name.length(); j++) {
                if (name.charAt(i)==name.charAt(j)) {
                  count++;
                }
            }
            if (count==1){
                result+=""+name.charAt(i);
            }
        }
        return result;
    }
}
