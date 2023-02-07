package Animals.Herbivores;

import Animals.Animal;

import java.util.List;
import java.util.Random;


public class Pig extends Animal {
    int weight = 400;
    int maximumNumberOfAnimal = 50;
    int speed = 2;
    double kiloOfFood = 50;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        double rand = new Random().nextDouble();
        switch (food.getType()) {
            case CATERPILLAR:
                if (rand < 0.9) {
                    System.out.println("The Pig ate the Caterpillar");
                }
                break;
            case MOUSE:
                if (rand < 0.5) {
                    System.out.println("The Pig ate the Mouse");
                }
                break;
//          case PLANT:
            default:
        }
    }
}
