package Animals.Predators;

import Animals.Animal;
import Config.AnimalActions.Eat;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Bear extends Animal implements Eat, Movebale, Reprodactionable {
    int weight = 500;
    int maximumNumberOfAnimal = 5;
    int speed = 2;
    int kiloOfFood = 80;
}
