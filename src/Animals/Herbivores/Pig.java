package Animals.Herbivores;

import Animals.Animal;

import java.util.List;
import java.util.Random;

import static Config.AnimalType.PLANT;


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
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case MOUSE:
                if (rand < 0.5) {
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
