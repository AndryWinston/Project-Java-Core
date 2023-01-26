package Config;

import Animals.Animal;
import Animals.Plants.Plant;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Cell {

    private final List<Animal> animals = new ArrayList<>();
    public static List<Plant> plants = new ArrayList<>();

    private int length;
    private int width;

    public Cell(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Cell() {
    }

    public int getLength() {
        int x = 0;
        return x;
    }

    public int getWidth() {
        int y = 0;
        return y;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public static List<Plant> getPlants() {
        return plants;
    }

    public int getPlantsSize() {
        return plants.size();
    }

    public void makePlants() {

    }
}
