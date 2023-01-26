package Animals;

import Config.AnimalType;

import java.util.HashMap;
import java.util.Random;


import static Config.AnimalType.*;

public abstract class Animal {

   private final static int weight = 0;
   private final static int maximumNumberOfAnimal = 0;
   private final static int speed = 0;
   private final static int kiloOfFood = 0;

   HashMap<AnimalType,Integer> hashMap = new HashMap<AnimalType, Integer>();

   public Animal() {
   }

   public static void reproduction(Animal a1, Animal a2) {
      //AnimalReprodaction.reprodaction(a1,a2);
   }

   public static void motionVector(Animal a) {
      System.out.println(a + "передвинулся на " + maximumNumberOfAnimal);
   }
   public static void eat(Animal p, Animal food) {
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
   public static void makeAnimals(HashMap map) {
//        for (String key: map.keySet())
//        {
//            Integer value = map.get(key);
//
//        }
      for (int i = 0; i < map.size(); i++) {
         System.out.println(i);
      }
   }


   public int getWeight() {
      return weight;
   }
   public static int getMaximumNumberOfAnimal() {
      return maximumNumberOfAnimal;
   }
   public int getSpeed() {
      return speed;
   }

   public int getKiloOfFood() {
      return kiloOfFood;
   }
}
//Ecnfk

