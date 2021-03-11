package cars;

import java.util.Scanner;

public class CARS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("-------- Car Race Game -------- ");
        System.out.println();
        System.out.println("Enter number of cars:");
        System.out.println();
        int numberOfCars = sc.nextInt();
        System.out.println();
        System.out.println("Enter distance (km): ");
        System.out.println();
        int maxDistance = sc.nextInt();
        System.out.println();

        int cars[] = new int[numberOfCars];
        int distance = 0;

        do {
            for (int i = 0; i < cars.length; i++) {
                cars[i] += (int) (Math.random() * 5 + 1);
                if (distance < cars[i]) {
                    distance = cars[i];
                }
            }
        } while (distance < maxDistance);
        System.out.println();
        System.out.println("-------- STATISTICS -------- ");
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.println((i + 1) + " car distance is: " + cars[i] + " km");
            System.out.println();
        }
    }
}
