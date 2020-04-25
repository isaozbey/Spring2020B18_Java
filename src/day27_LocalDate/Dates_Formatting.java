package day27_LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {





        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate dat1=LocalDate.now();
        System.out.println(dat1.format(dtf));


        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEE MM /dd//yy");
        LocalDate date2=LocalDate.of(2020,1,31);
        System.out.println(date2.format(dtf2));


    }
}
