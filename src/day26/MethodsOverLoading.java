package day26;
/*
warmup task:
	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in desending order
	6. write a double[] return method that can sort a double array in desending order
	7. write a char[] return method that can sort a char array in desending order
			NOTE: MUST apply method overloading
 */
public class MethodsOverLoading {
    public static void main(String[] args) {

        sum( 10,  25);

    }

    public static void sum (long a, long b) {
        System.out.println(a+b);
    }
    public static void sum1 (int a, double b) {
        System.out.println(a+b);
    }
}
