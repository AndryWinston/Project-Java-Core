package Animals.Herbivores;

import Animals.Animal;
import Config.AnimalActions.Eateble;
import Config.AnimalActions.Movebale;
import Config.AnimalActions.Reprodactionable;

public class Duck extends Animal implements Eateble, Movebale, Reprodactionable {
    int weight = 1;
    int maximumNumberOfAnimal = 200;
    int speed = 4;
    double kiloOfFood = 0.15;

    public void eat(){

    }
}
