package Animals.Predators;

import Animals.Animal;

import Config.Cell;

import java.util.List;
import java.util.Random;


public class Wolf extends Animal {
    int weight = 50;
    int maximumNumberOfAnimal = 30;
    int speed = 3;
    int kiloOfFood = 8;

    @Override
    public void eat(Animal p, Animal food, List<Animal> animals) {
        double rand = new Random().nextDouble();
        switch (food.getType()) {
            case DEER, PIG:
                if (rand < 0.15) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case HORSE, BUFFALO:
                if (rand < 0.1) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case RABBIT, GOAT:
                if (rand < 0.6) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case MOUSE:
                if (rand < 0.8) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case SHEEP:
                if (rand < 0.7) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            case DUCK:
                if (rand < 0.4) {
                    this.getCell().getAnimals().remove(food);
                }
                break;
            default:
        }
    }

    @Override
    public void moveVector(Animal a) {
        Cell cell = a.getCell();
        Cell newCell = new Cell();
        List<Animal> animals = a.getCell().getAnimals();
        if (animals.isEmpty()) {
            newCell.setX(cell.getX() + 1);
            newCell.setY(cell.getY() + 2);
            a.setCell(cell);
            System.out.println("Волк переместился с: " + cell + "на:" + newCell);
        }
    }
}
