package Config;

import Animals.Animal;
import Animals.Plants.Plant;

import java.util.List;

import static Config.AnimalType.*;

public class Creator {

    public static void makePlants(Cell cell) {
        List<Plant> plants = cell.getPlants();
        for (int p = 0; p < 200; p++) {
            plants.add(new Plant());
        }
    }

    public static void makeAnimals(Cell cell) {
        List<Animal> animals = cell.getAnimals();
        AnimalFactory animalFactory = new AnimalFactory();
        for (int i = 0; i < 2; i++) {
            animals.add(animalFactory.createAnimal(WOLF, cell));
            animals.add(animalFactory.createAnimal(PYTHON, cell));
            animals.add(animalFactory.createAnimal(FOX, cell));
            animals.add(animalFactory.createAnimal(BEAR, cell));
            animals.add(animalFactory.createAnimal(EAGLE, cell));
            animals.add(animalFactory.createAnimal(HORSE, cell));
            animals.add(animalFactory.createAnimal(DEER, cell));
            animals.add(animalFactory.createAnimal(RABBIT, cell));
            animals.add(animalFactory.createAnimal(MOUSE, cell));
            animals.add(animalFactory.createAnimal(GOAT, cell));
            animals.add(animalFactory.createAnimal(SHEEP, cell));
            animals.add(animalFactory.createAnimal(PIG, cell));
            animals.add(animalFactory.createAnimal(BUFFALO, cell));
            animals.add(animalFactory.createAnimal(DUCK, cell));
            animals.add(animalFactory.createAnimal(CATERPILLAR, cell));
        }
    }
}
