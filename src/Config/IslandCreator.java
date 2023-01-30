package Config;



public class IslandCreator {

    public static Object run() {
        IslandArray();
        return null;
    }
    public static void IslandArray(){
        Cell[][] island = new Cell[10][10];
        for (int i = 0; i < island.length; i++) {
            for (int j = 0; j < island[0].length; j++) {
                Cell cell = new Cell();
                cell.setX(i);
                cell.setY(j);
            }
        }
    }
}
//1 - создается остров с массивом клеток 2000шт.
//2 - в каждую клетку помещяется 200 растений
//3 - в каждую клетку заносится максимальное количество животных
//4 - работа клетки
