package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Goat extends Animal implements Eateble, Movebale, Reprodactionable {
    int weight = 60;
    int maximumNumberOfAnimal = 140;
    int speed = 3;
    int kiloOfFood = 10;
}
