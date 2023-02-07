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
            case DEER:
                if (rand < 0.15) {
                    System.out.println("Волк съел оленя");
                }
                break;
            case HORSE:
                if (rand < 0.1) {
                    System.out.println("Волк съел лошадь");
                }
                break;
            default:
        }
    }

    @Override
    public void moveVector(Animal a) {
        Cell cell = a.getCell();
        Cell newCell = new Cell(); //TODO: Прописать логику расчета клетки назначения
        newCell.setX(cell.getX()+1);
        newCell.setY(cell.getX()+2);
        a.setCell(cell);
        System.out.println("Волк переместился с: " + cell + "на:" + newCell);
    }
}
