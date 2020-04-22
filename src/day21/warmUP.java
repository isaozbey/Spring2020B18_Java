package day21;

public class warmUP {
    /*
    warmup tasks:
    1. write a program that can return the average number from an array of integers
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]
                average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0]
                average: 10
    2. write a program that can return the logest string of text from an array
    3. write a program that can return the shortest string of text from an array
     */
    public static void main(String [] args) {
        int sum=0;
        int [] numbers={4, 5, 6, 7, 8, 10, 20, 30, 0};

        for (int i = 0; i <numbers.length ; i++) {
           sum+=numbers[i] ;
        }
         System.out.println("Avreage is: "+(sum/numbers.length));
        String [] names= {"okes","sakir","Murtaza","Sefill"};
        String lname=Longest(names);
        System.out.println("Longest name is : "+lname);
        String [] names1= {"okks","sakir","Murtaza","Sefill"};

        System.out.println("Shortes name: "+shortes(names1));
    }

    public static String Longest (String [] names) {
        int max=names[0].length();
        String maxname="";
        for (int i = 1; i <names.length ; i++) {
            if (names[i].length()>max) {
                max=names[i].length();
                maxname=names[i];
            }
        }
      return maxname;
    }


    public static String shortes (String [] names1) {
        int min=names1[0].length();
        String minName=names1[0];

        for (int i = 0; i <names1.length ; i++) {
            if (names1[i].length()<min) {
                min=names1[i].length();
                minName=names1[i];
            }

        }

       return minName;
    }





}
