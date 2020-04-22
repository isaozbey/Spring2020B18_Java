package indivual2;

public class dimensinoalArray {

    public static void main(String [] args) {
        int x=1;
        int [] y=new int[10];
        int [] a={1,2};

        m(x,y);
        //System.out.println("x is "+x);
        //System.out.println("y[0] is "+y[0]);
        System.out.println("before invoking swap");
        System.out.println("A is "+a[0]+"  and B is "+a[1]);
        swap(a[0],a[1]);
        System.out.println("After invoking swap");
        System.out.println("A is "+a[0]+"  and B is "+a[1]);
      System.out.println("=================================================================================================");

        System.out.println("before invoking swap");
        System.out.println("A is "+a[0]+"  and B is "+a[1]);
        SwapFIrstToTwoInAray(a);
        System.out.println("After invoking swap");
        System.out.println("A is "+a[0]+"  and B is "+a[1]);


    }
    public static void m(int number, int [] numbers) {
        number=1001;
        numbers[0]=5555;
    }


    public static void swap(int n1, int n2) {
        int temp=n1;
        n1=n2;
        n2=temp;
    }
    public static void SwapFIrstToTwoInAray (int [] array) {
        int temp=array[0];
        array[0]=array[1];
        array[1]=temp;


    }

}
