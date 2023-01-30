package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Pig extends Animal implements Eateble, Movebale, Reprodactionable {
    int weight = 400;
    int maximumNumberOfAnimal = 50;
    int speed = 2;
    double kiloOfFood = 50;
}
