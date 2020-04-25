package day28;

import java.time.LocalDate;

/*
1. create an array of string, store five of your friends names in it
	2. create Array of localdates and store thier birthdays in the same order
	3. use for loop to print out your friends' names and thier birthdays
 */
public class warmUp {
    public static void main(String[] args) {

        String [] names={"Feyyaz","Ali","Metin","Oktay","Sergen"};
        LocalDate [] birthdays= {LocalDate.of(1991,06,11) ,
                LocalDate.of(1996,07,12) ,LocalDate.of(2001,9,13),
                LocalDate.of(2006,10,14),LocalDate.of(2011,11,15)};


        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i]+" "+birthdays[i]);
        }
    }
}
