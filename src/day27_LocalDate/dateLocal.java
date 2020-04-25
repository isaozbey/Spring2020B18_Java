package day27_LocalDate;
import java.time.LocalDate;
public class dateLocal {
    public static void main(String[] args) {


        LocalDate date1=LocalDate.of(2020,10,25);
        System.out.println(date1);

        LocalDate birthday=LocalDate.of(1991,06,11);
        System.out.println(birthday);

        boolean result1=date1.isBefore(birthday);
        System.out.println(result1);

        boolean result2=birthday.isLeapYear();
        System.out.println(result2);

        LocalDate date2=LocalDate.now();
        System.out.println(date2);




    }
}
