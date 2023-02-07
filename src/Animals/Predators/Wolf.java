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
                    System.out.println("The Wolf ate the Deer");
                }
                break;
            case HORSE:
                if (rand < 0.1) {
                    System.out.println("The Wolf ate the Horse");
                }
                break;
            case RABBIT:
                if (rand < 0.6) {
                    System.out.println("The Wolf ate the Rabbit");
                }
                break;
            case MOUSE:
                if (rand < 0.8) {
                    System.out.println("The Wolf ate the Mouse");
                }
                break;
            case GOAT:
                if (rand < 0.6) {
                    System.out.println("The Wolf ate the Goat");
                }
                break;
            case SHEEP:
                if (rand < 0.7) {
                    System.out.println("The Wolf ate the Sheep");
                }
                break;
            case PIG:
                if (rand < 0.15) {
                    System.out.println("The Wolf ate the Pig");
                }
                break;
            case BUFFALO:
                if (rand < 0.1) {
                    System.out.println("The Wolf ate the Buffalo");
                }
                break;
            case DUCK:
                if (rand < 0.4) {
                    System.out.println("The Wolf ate the Duck");
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
