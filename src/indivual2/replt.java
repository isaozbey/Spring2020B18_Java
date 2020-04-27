package indivual2;
import java.util.Arrays;
public class replt {
    public static void main(String[] args) {

        int [] number={5,6,89,8};

        boolean result=isSort(number);
        System.out.println(result);
        int [] list={10,5,2,3,9};
        list=do_switch(list);
        System.out.println(Arrays.toString(list));
    }

    public static boolean isSort(int[] nums)
    {
        int [] temp=new int[nums.length];
        temp=nums;
        Arrays.sort(nums);
        if (Arrays.equals(temp,nums)) {
            return true;
        }
        return false;

    }

    public static int[] do_switch(int[] i)
    {
        int [] swtFirst=new int[i.length];
        for (int k=1; k<i.length-1;k++) {
            swtFirst[k]=i[k];
        }
        swtFirst[0]=i[i.length-1];
        swtFirst[swtFirst.length-1]=i[0];


        return swtFirst;

    }


}
