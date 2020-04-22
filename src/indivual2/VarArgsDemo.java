package indivual2;

public class VarArgsDemo {
    public static void main(String[] args) {
        //printMax(34,3,3,2,56.5);
        printMax(new double[] {1,2,3});
    }


    public static void printMax(double [] numbers) {
        double mx=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]>mx) {
                mx=numbers[i];
            }
        }

    }
}
