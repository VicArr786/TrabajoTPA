package Jugador;

import java.util.Random;
public class random {
    public double Randomizer() {
        Random rand = new Random();
        double rand_dub1 = rand.nextDouble(100)+1;
        return rand_dub1;
    }
}
