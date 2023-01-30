package Config;

import Animals.Animal;
import Animals.Plants.Plant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static Config.AnimalType.*;

public class Cell {

    private static final List<Animal> animals = new ArrayList<>();
    private static final List<Plant> plants = new ArrayList<>();
    private int x;
    private int y;

    HashMap<AnimalType,Integer> hashMap = new HashMap<AnimalType, Integer>();

    public Cell() {
    }

    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public void setX(int x) {
        this.x = x;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public static void makePlants() {
        for (int p = 0; p < 200; p++) {
            plants.add(new Plant());
        }
    }

    public static void makeAnimals(){
        AnimalFactory animalFactory = new AnimalFactory();
        for (int i = 0; i < 2; i++) {
            animals.add(animalFactory.createAnimal(WOLF));
            animals.add(animalFactory.createAnimal(PYTHON));
            animals.add(animalFactory.createAnimal(FOX));
            animals.add(animalFactory.createAnimal(BEAR));
            animals.add(animalFactory.createAnimal(EAGLE));
            animals.add(animalFactory.createAnimal(HORSE));
            animals.add(animalFactory.createAnimal(DEER));
            animals.add(animalFactory.createAnimal(RABBIT));
            animals.add(animalFactory.createAnimal(MOUSE));
            animals.add(animalFactory.createAnimal(GOAT));
            animals.add(animalFactory.createAnimal(SHEEP));
            animals.add(animalFactory.createAnimal(PIG));
            animals.add(animalFactory.createAnimal(BUFFALO));
            animals.add(animalFactory.createAnimal(DUCK));
            animals.add(animalFactory.createAnimal(CATERPILLAR));
        }
    }
    public static void animalHashMap(HashMap map){
        map.put(WOLF, 30);
        map.put(PYTHON, 30);
        map.put(FOX, 30);
        map.put(BEAR, 5);
        map.put(EAGLE, 20);
        map.put(HORSE, 20);
        map.put(DEER, 20);
        map.put(RABBIT, 150);
        map.put(MOUSE, 500);
        map.put(GOAT, 140);
        map.put(SHEEP, 140);
        map.put(PIG, 50);
        map.put(BUFFALO, 10);
        map.put(DUCK, 200);
        map.put(CATERPILLAR, 1000);
    }

    @Override
    public String toString() {
        return "Cell{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}