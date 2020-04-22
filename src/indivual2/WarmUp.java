package indivual2;
import Resources.Library;
public class WarmUp {

    public static void main(String[] args) {

        String name="AABBCDEEEFGGH";
        String removed=Library.RemoveDuplicate(name);
        System.out.println(removed);

        String name2="AABBCDEEEFGGH";
        String uniqueReturn=Library.Unique(name2);
        System.out.println(uniqueReturn);


    }




}
