package Animals.Predators;

import Animals.Animal;

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
                    System.out.println("The Python ate the Fox");
                }
                break;
            case RABBIT:
                if (rand < 0.2) {
                    System.out.println("The Python ate the Rabbit");
                }
                break;
            case MOUSE:
                if (rand < 0.4) {
                    System.out.println("The Python ate the Mouse");
                }
                break;
            case DUCK:
                if (rand < 0.1) {
                    System.out.println("The Python ate the Duck");
                }
                break;
            default:
        }
    }
}

