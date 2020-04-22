package indivual2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLIstClass {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        ArrayList <Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(25);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));


        ArrayList<String> namelist=new ArrayList<>();
        namelist.add("Okkes");
        namelist.add("Sakir");
        namelist.add("Rustu");

        System.out.println(namelist);
        System.out.println(namelist.get(2));
        namelist.add("Riza");
        System.out.println(namelist);
        System.out.println("Enter a name");
        namelist.add(input.nextLine());
        System.out.println(namelist);






    }
}
