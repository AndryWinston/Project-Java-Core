package Animals.Herbivores;

import Animals.Animal;

import java.util.List;
import java.util.Random;

import static Config.AnimalType.PLANT;


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
                    this.getCell().getAnimals().remove(food);
                }
                break;
          case PLANT:
                if (p.getCell().getPlants().contains(PLANT)){
                    this.getCell().getPlants().remove(1);
                } else if (p.getCell().getPlants().isEmpty()) {
                    //xnj nj
                }
                break;
            default:
        }
    }
}
