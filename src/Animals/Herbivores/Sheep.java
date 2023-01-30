package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Sheep extends Animal implements Eateble, Movebale, Reprodactionable {
    int weight = 70;
    int maximumNumberOfAnimal = 140;
    int speed = 3;
    int kiloOfFood = 15;
}
