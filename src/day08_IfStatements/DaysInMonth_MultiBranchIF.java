package day08_IfStatements;

public class DaysInMonth_MultiBranchIF {

    public  static void main(String[] args ) {

        boolean b=1+11+"3"=="123";
        System.out.println(b);
        byte month=13;
        String result="";


        if(month==1) {
            result = "January has 31 days";
        }
            else if (month==2) {

                result="Fenruary has 28 or 29 days";
            }

        else if (month==3) {

            result="March has 31 days";
        }

        else if (month==4) {

            result="April has 30 days";
        }

        else if (month==5) {

            result="May has 30 days";
        }
        else if (month==6) {

            result="June has 31 days";
        }

        else if (month==7) {

            result="July has 30 days";
        }

        else if (month==8) {

            result="August has 31 days";
        }
        else if (month==9) {

            result="September has 30 days";
        }

        else if (month==10) {

            result="October has 31 days";
        }

        else if (month==11) {

            result="November has 30 days";
        }

        else if (month==12) {

            result="December has 31 days";
        }
        else {
            result="Invalid Entry";
        }



System.out.println(result);



        }

    }

