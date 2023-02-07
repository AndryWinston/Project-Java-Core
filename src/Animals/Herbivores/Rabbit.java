package Animals.Herbivores;

import Animals.Animal;

import java.util.List;


public class Rabbit extends Animal {
    int weight = 2;
    int maximumNumberOfAnimal = 150;
    int speed = 2;
    double kiloOfFood = 0.45;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        //ate the Plant
    }
}
