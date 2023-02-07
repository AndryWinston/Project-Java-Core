package Animals;


import Config.AnimalFactory;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {

   public Animal() {
   }

   public static void eat(Animal p, Animal food, List<Animal> animals){
      double random = ThreadLocalRandom.current().nextDouble(0.0,1.0);
//      if () {
//
//      }


   }
   static void moveVector(Animal a) {

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


