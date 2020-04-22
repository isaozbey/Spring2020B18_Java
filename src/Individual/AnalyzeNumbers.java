package Individual;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AnalyzeNumbers {

    public static void main (String [] args) {
        Scanner input= new Scanner(System.in);
        Random rand= new Random();
        System.out.println("Enter the number of items");
        int n =input.nextInt();
        int sum=0;
        int count=0;
        int [] numbers= new int[n];

        for (int i = 0; i <n ; i++) {

            numbers[i]=rand.nextInt(10);
            sum+=numbers[i];
        }

        double average=sum/n;

        System.out.println("Average= "+average);

        for (int i = 0; i <n ; i++) {
            if (numbers[i]>average){
                count++;
            }

        }
        System.out.println("The numbers of greater than average is :"+count);
        System.out.print(Arrays.toString(numbers));

    }
}
