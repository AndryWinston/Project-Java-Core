package Config;

import Animals.Animal;
import Animals.Plants.Plant;
import java.util.ArrayList;
import java.util.List;

public class Cell {

    private static final List<Animal> animals = new ArrayList<>();
    private static final List<Plant> plants = new ArrayList<>();
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

    public static List<Plant> makePlants() {
        for (int p = 0; p < 200; p++) {
            plants.add(new Plant());
        }
        return plants;
    }

//    public List<Animal> makeAnimals(){
//        for (int i = 0; i < 2; i++) {
//            animals.add(null);
//        }
//        return animals;
//    }

}