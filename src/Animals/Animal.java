package Animals;


import Config.AnimalFactory;
import Config.AnimalType;
import Config.Cell;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

   private AnimalType type;

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

   public AnimalType getType() {
      return type;
   }

   public Animal() {
   }

   public void eat(Animal p, Animal food, List<Animal> animals){
      double random = ThreadLocalRandom.current().nextDouble(0.0,1.0);
//      if () {
//
//      }


   }
   public void moveVector(Animal a) {
   }

   static Object reprodaction(Animal a, List<Animal> animals) {
      AnimalFactory animalFactory = new AnimalFactory();
      for (Animal animal : animals) {
         if (animals.contains(a)) {

         }
      }
      System.out.println("спарился с ");
      return null;
   }
}


