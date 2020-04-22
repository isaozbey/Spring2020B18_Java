package day22;
import java.util.Scanner;
public class CarFactory {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

        int [] yearEx={2010,2011,2012};
        int [] yearCl={2015,2016,2017,2018};

        if (model.equalsIgnoreCase("Extravagant") ) {
            for (int each : yearEx) {
                if (year == each ) {
                    recalled = true;
                }
            }
        }else if (model.equalsIgnoreCase("Guzzler") ) {
            for (int each : yearCl) {
                if (year == each ) {
                    recalled = true;
                }
            }
        }


      System.out.println(recalled);

    }
}
