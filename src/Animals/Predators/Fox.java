package Animals.Predators;

import Animals.Animal;
import Config.AnimalActions.Eat;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Fox extends Animal implements Eat, Eateble, Movebale, Reprodactionable {
    int weight = 8;
    int maximumNumberOfAnimal = 30;
    int speed = 2;
    int kiloOfFood = 2;
}
