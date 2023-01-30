package Config.AnimalActions;

import Animals.Animal;
import Config.AnimalType;

public interface Reprodactionable {
    static Object reprodaction(AnimalType a1, AnimalType a2) {
        System.out.println(a1 + "спарился с " + a2);


        return null;
    }
}
