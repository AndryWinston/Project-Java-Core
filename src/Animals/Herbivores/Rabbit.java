package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Rabbit extends Animal implements Eateble, Movebale, Reprodactionable {
    int weight = 2;
    int maximumNumberOfAnimal = 150;
    int speed = 2;
    double kiloOfFood = 0.45;
}
