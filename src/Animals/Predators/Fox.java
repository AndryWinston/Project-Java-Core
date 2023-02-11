package Animals.Predators;

import Animals.Animal;

import java.util.List;
import java.util.Random;

public class Fox extends Animal {
    int weight = 8;
    int maximumNumberOfAnimal = 30;
    int speed = 2;
    int kiloOfFood = 2;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        double rand = new Random().nextDouble();
        switch (food.getType()) {
            case CATERPILLAR:
                if (rand < 0.4) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case RABBIT:
                if (rand < 0.7) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case MOUSE:
                if (rand < 0.9) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case DUCK:
                if (rand < 0.6) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            default:
        }
    }
}
