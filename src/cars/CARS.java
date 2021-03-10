package cars;

import java.util.Scanner;

public class CARS {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("-------- Car Race Game -------- ");
        System.out.println();
        System.out.println("Choose how many cars: ");
        System.out.println();
        int numberOfCars = sc.nextInt();
        System.out.println();

        int cars[] = new int[numberOfCars];

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] >= 100) {
                break;
            } else {
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
        }

        for (int z = 0; z < cars.length; z++) {
            System.out.println((z + 1) + " car distance is: " + cars[z]);
            System.out.println();
        }
        System.out.println();
    }
}
