package Config;

import Animals.Animal;
import Animals.Herbivores.*;

import Animals.Predators.*;

public class AnimalFactory {
    public Animal createAnimal(AnimalType type, Cell cell) {
        Animal animal;
        animal = switch (type) {
            case WOLF -> new Wolf();
            case PYTHON -> new Python();
            case FOX -> new Fox();
            case BEAR -> new Bear();
            case EAGLE -> new Eagle();
            case HORSE -> new Horse();
            case DEER -> new Deer();
            case RABBIT -> new Rabbit();
            case MOUSE -> new Mouse();
            case GOAT -> new Goat();
            case SHEEP -> new Sheep();
            case PIG -> new Pig();
            case BUFFALO -> new Buffalo();
            case DUCK -> new Duck();
            case CATERPILLAR -> new Caterpillar();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
        animal.setType(type);
        animal.setCell(cell);
        return animal;
    }

}
