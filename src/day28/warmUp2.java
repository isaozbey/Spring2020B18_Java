package day28;

import java.time.LocalDate;

public class warmUp2 {
    public static void main(String[] args) {

    }

    public static void Birthday(int year,int month , int day) {

        LocalDate today=LocalDate.now();

        LocalDate bithd= LocalDate.of (year,month,day);

        int d=today.getMonthValue();




    }
}
