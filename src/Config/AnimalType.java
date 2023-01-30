package Config;

public enum AnimalType {
    WOLF("WOLF"),
    PYTHON("PYTHON"),
    FOX("FOX"),
    BEAR("BEAR"),
    EAGLE("EAGLE"),
    HORSE("HORSE"),
    DEER("DEER"),
    RABBIT("RABBIT"),
    MOUSE("MOUSE"),
    GOAT("GOAT"),
    SHEEP("SHEEP"),
    PIG("PIG"),
    BUFFALO("BUFFALO"),
    DUCK("DUCK"),
    CATERPILLAR("CATERPILLAR");

    private final String type;

    public String getType() {
        return type;
    }

    AnimalType(String type) {
        this.type = type;
    }


}
