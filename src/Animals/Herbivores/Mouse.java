package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Mouse extends Animal implements Eateble, Movebale, Reprodactionable {
    double weight = 0.05;
    int maximumNumberOfAnimal = 500;
    int speed = 1;
    double kiloOfFood = 0.01;
}
