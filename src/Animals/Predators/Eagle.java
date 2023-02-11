package Animals.Predators;

import Animals.Animal;

import java.util.List;
import java.util.Random;


public class Eagle extends Animal {
    int weight = 6;
    int maximumNumberOfAnimal = 20;
    int speed = 3;
    int kiloOfFood = 1;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        double rand = new Random().nextDouble();
        switch (food.getType()) {
            case FOX:
                if (rand < 0.1) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case RABBIT, MOUSE:
                if (rand < 0.9) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case DUCK:
                if (rand < 0.8) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            default:
        }
    }
}
