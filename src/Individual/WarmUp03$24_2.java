package Individual;

import java.security.PublicKey;

public class WarmUp03$24_2 {

    public static void main (String[]args) {

        int num=45;

        String result=" ";

        result=num==1?"one" :num==2?"Two":num==3?"Three":num==4?"Four" :num==5?"Fiver":num==6?"Six":num==7?"Seven"
                :num==8?"Eight" :num==9?"Nine":"Invalid";

        System.out.println(result);

        /////////////////////////////////////////////////
        int month =2;

        boolean day28=month==2;
        boolean day30=month==4 || month==6 ||month==9 | month==11;
        String result2=" ";

        if (month>0 && month<13) {
            result2=day28?"has 28 days" :day30?"has 30 days":"has 31 days";

        }else {
            result2="invalid";
        }


        System.out.println(result2);
    }
}
