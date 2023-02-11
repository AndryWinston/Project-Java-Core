package Animals;


import Config.AnimalType;
import Config.Cell;

import java.util.List;

import static Config.AnimalType.PLANT;

public abstract class Animal {

   private AnimalType type;

   public AnimalType getType() {
      return type;
   }

   public void setType(AnimalType type) {
      this.type = type;
   }

   private Cell cell;

   public Cell getCell() {
      return cell;
   }

   public void setCell(Cell cell) {
      this.cell = cell;
   }

   public Animal() {
   }

   public void eat(Animal p, Animal food, List<Animal> animals){
   }
   public void eat(Animal a){
      if (a.getCell().getPlants().contains(PLANT)){
         this.getCell().getPlants().remove(1);
      } else if (a.getCell().getPlants().isEmpty()) {
         a = null;
      }
   }
   public void moveVector(Animal a) {
         Cell cell = a.getCell();
         Cell newCell = new Cell();
         List<Animal> animals = a.getCell().getAnimals();
         if (animals.isEmpty()) {
            newCell.setX(cell.getX() + 1);
            newCell.setY(cell.getY() + 2);
            a.setCell(cell);
            System.out.println(a.getType() + "переместился с: " + cell + "на:" + newCell);
         }
   }

   public Animal reprodaction(Animal a, List<Animal> animals) {
      List<Animal> animalList = a.cell.getAnimals();
      Animal b = null;
//      if (a.getCell().getAnimals().contains(a.getType())){
//         b = animalList.add(new a.getType());
//      }
      return b;
   }
}


