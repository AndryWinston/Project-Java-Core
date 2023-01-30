package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Horse extends Animal implements Eateble, Movebale, Reprodactionable {
    int weight = 400;
    int maximumNumberOfAnimal = 20;
    int speed = 4;
    int kiloOfFood = 60;
}
