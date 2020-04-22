package day22;

public class nestedLoop {

    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
              };
         int SumOfEven=0;
        for (int i = 0; i <numbers.length ; i++) {

            for (int j = 0; j <numbers[i].length ; j++) {

                if (numbers[i][j]%2==0) {
                    System.out.print(numbers[i][j]+" ");
                }else {
                    SumOfEven++;
                }

            }
        }

        System.out.println();
        System.out.print(SumOfEven);


    }
}
