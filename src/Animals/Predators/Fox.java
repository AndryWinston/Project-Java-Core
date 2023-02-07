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
                    System.out.println("The Fox ate the Caterpillar");
                }
                break;
            case RABBIT:
                if (rand < 0.7) {
                    System.out.println("The Fox ate the Rabbit");
                }
                break;
            case MOUSE:
                if (rand < 0.9) {
                    System.out.println("The Fox ate the Mouse");
                }
                break;
            case DUCK:
                if (rand < 0.6) {
                    System.out.println("The Fox ate the Duck");
                }
                break;
            default:
        }
    }
}
