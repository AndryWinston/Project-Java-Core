package Config;

import Animals.Animal;

import Animals.Herbivores.*;
import Animals.Predators.*;

public class AnimalFactory {
    public Animal createAnimal(AnimalType type) {
        Animal animal = null;
        switch (type) {
            case WOLF:
                animal = new Wolf();
                break;
            case PYTHON:
                animal = new Python();
                break;
            case FOX:
                animal = new Fox();
                break;
            case BEAR:
                animal = new Bear();
                break;
            case EAGLE:
                animal = new Eagle();
                break;
            case HORSE:
                animal = new Horse();
                break;
            case DEER:
                animal = new Deer();
                break;
            case RABBIT:
                animal = new Rabbit();
                break;
            case MOUSE:
                animal = new Mouse();
                break;
            case GOAT:
                animal = new Goat();
                break;
            case SHEEP:
                animal = new Sheep();
                break;
            case PIG:
                animal = new Pig();
                break;
            case BUFFALO:
                animal = new Buffalo();
                break;
            case DUCK:
                animal = new Duck();
                break;
            case CATERPILLAR:
                animal = new Caterpillar();
                break;
        }
        return animal;
    }
}
