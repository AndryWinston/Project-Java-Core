package Animals.Predators;

import Animals.Animal;

import java.util.List;
import java.util.Random;

public class Bear extends Animal  {
    int weight = 500;
    int maximumNumberOfAnimal = 5;
    int speed = 2;
    int kiloOfFood = 80;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        double rand = new Random().nextDouble();
        switch (food.getType()) {
            case PYTHON, RABBIT, DEER:
                if (rand < 0.8) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case MOUSE:
                if (rand < 0.9) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case DUCK:
                if (rand < 0.1) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case HORSE:
                if (rand < 0.4) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case GOAT, SHEEP:
                if (rand < 0.7) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case PIG:
                if (rand < 0.5) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case BUFFALO:
                if (rand < 0.2) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            default:
        }
    }
}
