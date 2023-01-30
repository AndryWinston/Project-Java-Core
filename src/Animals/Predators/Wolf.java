package Animals.Predators;

import Animals.Animal;
import Config.AnimalActions.Eat;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Wolf extends Animal implements Eat, Movebale, Reprodactionable {
    int weight = 50;
    int maximumNumberOfAnimal = 30;
    int speed = 3;
    int kiloOfFood = 8;
}
