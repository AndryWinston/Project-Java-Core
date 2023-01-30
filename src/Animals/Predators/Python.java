package Animals.Predators;

import Animals.Animal;
import Config.AnimalActions.Eat;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Python extends Animal implements Eat, Eateble, Movebale, Reprodactionable {
    int weight = 15;
    int maximumNumberOfAnimal = 30;
    int speed = 1;
    int kiloOfFood = 3;


}
