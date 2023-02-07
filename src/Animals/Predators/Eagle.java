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
                    System.out.println("The Eagle ate the Fox");
                }
                break;
            case RABBIT:
                if (rand < 0.9) {
                    System.out.println("The Eagle ate the Rabbit");
                }
                break;
            case MOUSE:
                if (rand < 0.9) {
                    System.out.println("The Eagle ate the Mouse");
                }
                break;
            case DUCK:
                if (rand < 0.8) {
                    System.out.println("The Eagle ate the Duck");
                }
                break;
            default:
        }
    }
}
