package Animals.Herbivores;

import Animals.Animal;

import java.util.List;
import java.util.Random;


public class Duck extends Animal {
    int weight = 1;
    int maximumNumberOfAnimal = 200;
    int speed = 4;
    double kiloOfFood = 0.15;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        double rand = new Random().nextDouble();
        switch (food.getType()) {
            case CATERPILLAR:
                if (rand < 0.4) {
                    System.out.println("The Duck ate the Caterpillar");
                }
                break;
//          case PLANT:

            default:
        }
    }
}
