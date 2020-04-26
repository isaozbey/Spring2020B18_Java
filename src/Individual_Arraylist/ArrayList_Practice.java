package Individual_Arraylist;
import javax.swing.*;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Practice {
    public static void main(String[] args) {

       ArrayList<String > shoppingList=new ArrayList<>();
       shoppingList.add("apple");
       shoppingList.add("Orange");
       shoppingList.add("Grape");

      // System.out.println(shoppingList);
       shoppingList.add(1,"Strawberry") ;
         //System.out.println(shoppingList);
         shoppingList.add(4,"Gazoz");
         //System.out.println(shoppingList);

         ArrayList<Integer> numbers=new ArrayList<>();
         numbers.add(0,5);
        numbers.add(1,10);
        numbers.add(2,15);
        numbers.add(1,25);
        //System.out.println(numbers);


        for (String each:shoppingList) {
            //System.out.print(each+",");
        }

        ArrayList<String > students=new ArrayList<>();
        students.add("Holly");
        students.add("Erhan");
        students.add("Nadira");
        students.add("Seyfo");
        students.add("Cihan");

        //students.clear();
        System.out.println(students);
        students.set(4,"Shawkrat");
        System.out.println(students.get(4));
        students.add(0,"Okkes");
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        students.remove(5);
        System.out.println(students);

        Integer a=1;
        boolean b=students.remove(a);
        System.out.println(b);
        System.out.println(students);



         ArrayList <String > city=new ArrayList<>();
         city.add("Miami");
         city.add("Gotham");
         city.add("Azarbaijan");
         city.add("Istanbul");
         city.add("Urumqi");

        boolean b1=city.remove("Miami");

         System.out.println(b1 +" "+city);






















    }
}
