package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;


public class Buffalo extends Animal implements Eateble, Movebale, Reprodactionable {
    int weight = 700;
    int maximumNumberOfAnimal = 10;
    int speed = 3;
    int kiloOfFood = 100;
}
