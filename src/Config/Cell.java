package Config;

import Animals.Animal;
import Animals.Plants.Plant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static Config.AnimalType.*;

public class Cell {

    private final List<Animal> animals = new ArrayList<>();
    private final List<Plant> plants = new ArrayList<>();
    private int x;
    private int y;


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

    public List<Plant> getPlants() {
        return plants;
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