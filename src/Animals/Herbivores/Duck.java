package Animals.Herbivores;

import Animals.Animal;
import Animals.Plants.Plant;

import java.util.List;
import java.util.Random;

import static Config.AnimalType.PLANT;


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
