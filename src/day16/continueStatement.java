package day16;
import  java.util.Scanner;
public class continueStatement {
    public  static  void main (String [] args) {
        /*for (int i = 0; i <=20; i++) {

            if (i%2==0)
                continue;
            System.out.print(i+" ");
        }*/
        /*for (char i = 'Z'; i >'A' ; i--) {

            if (i=='Y' || i=='H' || i=='J' || i=='D') {
                continue;
            }

            System.out.print(i+" ");
        }*/  //
        /*for (int i = 1; i <=100; i++) {

            if (i%3==0 || i%5==0) {
                continue;
            }
            System.out.print(i+" ");
        }*/
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender=message.substring(message.indexOf("<"+1),message.indexOf(">"));

        phoneNumber=message.substring(message.indexOf("["+1),message.indexOf("]"));

        messageBody=message.substring(message.indexOf("{"+1),message.indexOf("}"));

        System.out.println("Sender: "+sender);
        System.out.println("Phone Number: "+phoneNumber);
        System.out.println("Message body: "+messageBody);
    }
}
