
package cars;

import java.util.Arrays;

public class CARS {

    public static void main(String[] args) {
    
        
        int cars[] = new int[8];
        
        
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] < 100){
               cars[i] += ((Math.random())*5)+1;
                System.out.println(Arrays.toString(cars));
            }
        }
    }
    
}
