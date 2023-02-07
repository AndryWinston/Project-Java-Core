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
            case PYTHON:
                if (rand < 0.8) {
                    System.out.println("The Bear ate the Python");
                }
                break;
            case RABBIT:
                if (rand < 0.8) {
                    System.out.println("The Bear ate the Rabbit");
                }
                break;
            case MOUSE:
                if (rand < 0.9) {
                    System.out.println("The Bear ate the Mouse");
                }
                break;
            case DUCK:
                if (rand < 0.1) {
                    System.out.println("The Bear ate the Duck");
                }
                break;
            case HORSE:
                if (rand < 0.4) {
                    System.out.println("The Bear ate the Horse");
                }
                break;
            case DEER:
                if (rand < 0.4) {
                    System.out.println("The Bear ate the Deer");
                }
                break;
            case GOAT:
                if (rand < 0.7) {
                    System.out.println("The Bear ate the Goat");
                }
                break;
            case SHEEP:
                if (rand < 0.7) {
                    System.out.println("The Bear ate the Sheep");
                }
                break;
            case PIG:
                if (rand < 0.5) {
                    System.out.println("The Bear ate the Pig");
                }
                break;
            case BUFFALO:
                if (rand < 0.2) {
                    System.out.println("The Bear ate the Buffalo");
                }
                break;
            default:
        }
    }
}
