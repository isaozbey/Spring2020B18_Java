package Individual_Arraylist;

public class methodCalls {
    public static void main(String[] args) {
        int larget=max(10,30);
        System.out.println(larget);

    }
    public static int max(int a, int b) {
        return (a>b) ? a :b;
    }
    public static int max(int a,int b, int c) {
        return (max(a,b)>c) ? max(a,b): c;

    }
}
