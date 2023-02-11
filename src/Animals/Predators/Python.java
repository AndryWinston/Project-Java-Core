package Animals.Predators;

import Animals.Animal;
import Config.Cell;

import java.util.List;
import java.util.Random;


public class Python extends Animal {
    int weight = 15;
    int maximumNumberOfAnimal = 30;
    int speed = 1;
    int kiloOfFood = 3;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        double rand = new Random().nextDouble();
        switch (food.getType()) {
            case FOX:
                if (rand < 0.15) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case RABBIT:
                if (rand < 0.2) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case MOUSE:
                if (rand < 0.4) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case DUCK:
                if (rand < 0.1) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            default:
        }
    }
}

