package Jugador;

import Jugador.Car;
import Jugador.Player;

import java.util.Random;

public class NPC extends Player {
    public Car nPCCarCreation(int level) {
        Car cochePlayer = new Car("lol", "rojo",
                130 + (level*15),
                4 + (level * 5));
        return cochePlayer;
    }
    public void accelerate() {
        random random = new random();
        acceleration= random.Randomizer();
    }
}
