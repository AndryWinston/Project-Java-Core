package Animals;

import Config.AnimalType;

import java.util.HashMap;
import java.util.Random;


import static Config.AnimalType.*;

public abstract class Animal {

   HashMap<AnimalType,Integer> hashMap = new HashMap<AnimalType, Integer>();

   public Animal() {
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
}


