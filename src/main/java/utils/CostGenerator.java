package utils;

import java.util.Random;

/**
 * Are o functie care genereaza un numar random de la 1 la 10
 */
public class CostGenerator {
    public int getCost() {
        Random random = new Random();
        return random.nextInt(10);
    }
}
