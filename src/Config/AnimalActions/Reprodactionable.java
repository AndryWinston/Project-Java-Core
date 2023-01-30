package Config.AnimalActions;

import Animals.Animal;
import Animals.Herbivores.Goat;
import Config.AnimalType;
import Config.Cell;

import java.util.List;

public interface Reprodactionable {
    static Object reprodaction(AnimalType a1, AnimalType a2, List<Animal> animals) {
//        String type = AnimalType;

        for (Animal animal : animals) {

        }
        System.out.println(a1 + "спарился с " + a2);
        return null;
    }
}
