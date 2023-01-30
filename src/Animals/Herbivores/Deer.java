package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Deer extends Animal implements Eateble, Movebale, Reprodactionable {
    int weight = 300;
    int maximumNumberOfAnimal = 20;
    int speed = 4;
    int kiloOfFood = 50;
}
