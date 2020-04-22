package indivual2;

public class CountOfPrime {

    public static void main(String[] args) {

        primeNumber(50);
    }
    public static void primeNumber(int numberOfPrime) {

        int count=0;
        int number=1;
        while (count<numberOfPrime) {
            number++;
            if (isPrime (number)) {
                System.out.print(number + " ");
                count++;
            }
        }

      //System.out.print(count);
    }

    public static boolean isPrime(int number) {

        for (int i = 2; i <number ; i++) {
            if (number%i==0){
                return false;
            }
        }
       return true;
    }
}
