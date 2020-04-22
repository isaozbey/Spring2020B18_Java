package day22;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Zombie {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

        int [] yearList={2010,2011,2012,2015,2016,2017,2018};




        for(int i=2010;i<=2012;i++){
            if(model.equalsIgnoreCase("Extravagant")&&
                    year==i){
                recalled=true;
            }
        }
        for(int i=2015;i<=2018;i++){
            if(model.equalsIgnoreCase("Guzzler")&&
                    year==i){
                recalled=true;}}
        System.out.println(recalled);}}





