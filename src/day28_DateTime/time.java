package day28_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String[] args) {

        LocalTime time1=LocalTime.now();
        LocalDate date1=LocalDate.now();
       //   System.out.println(date1);
      // System.out.println(time1);

        LocalTime time2=LocalTime.of(12,30,45 );
        LocalDate date2=LocalDate.of(2020,10,28);
        //System.out.println(date2);
        System.out.println(time2);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMM/dd/YYYY");
        String test=date2.format(dtf);
        System.out.println(test);

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("hh:mm:ss:a");
        String test2=time2.format(dtf2);
        System.out.println(test2);





    }

}
