package Individual;

public class WarmUp03$24 {

    public  static void main(String [] args) {
        String result=" ";
        int day=4;

        String resul2=" ";

        if (day>0 && day<8) {

            resul2=day==1 ?"Monday" :day==2 ?"Tuesday" :day==3?"Wednesday":day==4?"Thursday" :day==5?"Friday"
                    :day==6?"Saturday" :"Sunday";

        }else {
            resul2="invalid";
        }

        /*if (day>0 && day<=7) {

            if(day==1){
                result = "Moday";
            } else if(day==2){
                result = "Tuesday";
            } else if(day==3){
                result = "Wednesday";
            }else  if(day==4){
                result = "Thursday";
            }else  if(day==5){
                result = "Friday";
            }
            else  if(day==6){
                result = "Saturday";
            }
            else {
            result="Sunday";
            }

        }
        else {
            result="Invalid Entry";
        }
        System.out.println(result);
  */

        System.out.println(resul2);

    }
}
