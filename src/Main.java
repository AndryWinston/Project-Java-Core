import Config.IslandCreator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the game " + "\"Island\"!");
        System.out.println("Chose option:");
        menu();
        Scanner scanner = new Scanner(System.in);
        int solution = scanner.nextInt();
        while (true) {
            if (solution == 1) {
                IslandCreator islandCreator = new IslandCreator();
                //islandCreator.run();
            } else if (solution == 2) {
                System.out.println("Thanks for game! :D");
                break;
            }
        }
    }
    public static void menu() {
        System.out.println("1 - Start Game!");
        System.out.println("2 - Exit!");
    }

}
