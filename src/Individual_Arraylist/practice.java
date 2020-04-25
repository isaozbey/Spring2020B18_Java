package Individual_Arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class practice {
    public static void main(String[] args) {

        Integer num=20;
        System.out.println(num.MAX_VALUE);


        Integer num2=Integer.parseInt("1453");
        System.out.println(num2+1);

        ArrayList<Integer> list= new ArrayList<>();
        list.add(70);
        list.add(50);
        list.add(40);
        System.out.println(list);

        long value=list.get(1);
        System.out.println(value);
        Collections.sort(list);
        //list.clear();
        System.out.println(list);

    }


}
