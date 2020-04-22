package day22;

public class ZombieAttack {
    public static void main(String[] args) {

        int [] habitats={3, 6, 0, 4, 3, 2, 7, 1} ;
        int k=0;
        int population=0;
        while (true) {


            System.out.print("Day "+k+" ");
            for (int each : habitats) {
                System.out.print(each + " ");
            }

            for (int i = 0; i <habitats.length ; i++) {
               habitats[i]/=2;
               population+=habitats[i];
            }

            if (population==0){
                break;
            }
            population=0;
           System.out.println();
            k++;

        }
        System.out.println();
        System.out.print("Extinct");
    }
}
