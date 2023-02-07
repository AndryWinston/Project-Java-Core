package Animals.Herbivores;

import Animals.Animal;

import java.util.List;
import java.util.Random;


public class Mouse extends Animal {
    double weight = 0.05;
    int maximumNumberOfAnimal = 500;
    int speed = 1;
    double kiloOfFood = 0.01;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        double rand = new Random().nextDouble();
        switch (food.getType()) {
            case CATERPILLAR:
                if (rand < 0.4) {
                    System.out.println("The Mouse ate the Caterpillar");
                }
                break;
//          case PLANT:
            default:
        }
    }
}
