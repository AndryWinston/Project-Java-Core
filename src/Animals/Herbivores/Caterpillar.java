package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Caterpillar extends Animal implements Eateble, Movebale, Reprodactionable {
    double weight = 0.01;
    int maximumNumberOfAnimal = 1000;
    int speed = 0;
    int kiloOfFood = 0;
}
