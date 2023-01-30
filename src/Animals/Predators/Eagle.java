package Animals.Predators;

import Animals.Animal;
import Config.AnimalActions.Eat;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Eagle extends Animal implements Eat, Movebale, Reprodactionable {
    int weight = 6;
    int maximumNumberOfAnimal = 20;
    int speed = 3;
    int kiloOfFood = 1;
}
