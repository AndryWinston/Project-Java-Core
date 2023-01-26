package Animals.Plants;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    public static List<Plant> plants = new ArrayList<>();

    public Plant() {
    }

    public static void grow() {
        for (int p = 0; p < 200; p++) {
            Plant pl = new Plant();
        }
    }
}
