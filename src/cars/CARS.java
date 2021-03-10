package cars;

import java.util.Scanner;

public class CARS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("-------- Car Race Game -------- ");
        System.out.println();
        System.out.println();
        int cars[] = new int[8];

        for (int i = 0; i < cars.length; i++) {
            for (int k = 0; k < cars.length; k++) {
                for (int j = 0; j < cars.length; j++) {
                    if (cars[j] < 100) {
                        cars[j] += ((Math.random()) * 5) + 1;
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + " car distance is: " + cars[i]);
            System.out.println();
        }
    }
}
