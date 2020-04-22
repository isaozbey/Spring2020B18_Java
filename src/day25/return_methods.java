package day25;

public class return_methods {
    public static void main(String[] args) {
        int max=max(9,9);
        System.out.println(max);

    }
    public static int max(int a, int b) {
        int max=0;
        if (a>b) {
            return a;
        }else if (b>a) {

            return b;

        }

        return 0;
    }
}
