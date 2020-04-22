package day15;
import java.util.Scanner;
public class warmUp {
/*1. write a program that asks user's first and last name, then prints out the initials of the user
    Ex:
    input:
    cybertek
            batch12
    output:your initial is: CB */
/*
username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password"
 */
   public  static void main (String []args) {

      /*    Scanner scan= new Scanner(System.in);

        System.out.println("Enter your first name");
        String name=scan.nextLine();
        System.out.println("Enter your last name");
        String lastName=scan.nextLine();


        System.out.println("Initials:"+(name.substring(0,1)+"."+lastName.substring(0,1)).toUpperCase());
       */
      /*Scanner input= new Scanner(System.in);
          String  name="cybertek.batch17@gmail.com";
          String password="JavaBeauties";
      System.out.println("Enter your username");
      String inputuserName=input.nextLine();
        System.out.println("Enter your Password");
        String inputPassword=input.nextLine();


           if (inputuserName.equalsIgnoreCase(name) && inputPassword.equals(password)) {
               System.out.println("Logged in");


           }else {
               if (!inputuserName.endsWith("gmail.com")) {
                   System.out.println("it's not a valid email");
               }


           }

       */
      /*String str="Jave";
      String  result= "";

      result= str.substring(str.length()-1)+str.substring(str.length()-2,str.length()-1)+str.substring(str.length()-3,str.length()-2)+str.substring(str.length()-4,str.length()-3);
      //System.out.println(result);
      String result2="";

      for (int i=str.length()-1; i>=0;i--) {
          result2+=result+str.charAt(i);
      }
      System.out.println(result);*/

      Scanner input= new Scanner(System.in);

      System.out.println("Enter a word");
      String  str= input.nextLine();

      /*
          if (str.substring(0,1).equals(str.substring(str.length()-1)) && str.substring(1,2).equals(str.substring(str.length()-2,str.length()-1))) {
              System.out.println("true");
          }else {
              System.out.println("false");

          }

       */
          String reverse="";
       for (int i = str.length()-1; i >=0 ; i--) {

           reverse+=str.charAt(i);
       }
       System.out.println(str.equals(reverse));

      }


    }

