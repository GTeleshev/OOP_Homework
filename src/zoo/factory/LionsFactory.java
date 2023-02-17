package zoo.factory;
import zoo.animals.Lion;
import java.util.ArrayList;
import java.util.Random;


public class LionsFactory {
//    Создать package – factory. Работу продолжаем в нем
//    Создать класс LionsFactory
//    Реализовать в нем статический метод для создания коллекции львов с определенным кол-вом в ней:
//    ArrayList<Lion> createLions (int lionCount)
//    В методе main создать коллекцию львов и положить её содержимое в клетку. Посмотрите состояние львов, покормите львов в клетке, проверьте изменился ли у них вес.
    private static Random rand = new Random();

    public static ArrayList<Lion> createLionCollection(int lionCount){
        ArrayList<Lion> newLionCollection = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            newLionCollection.add(new Lion(rand.nextInt(50),rand.nextInt(50),4,rand.nextInt(20)));
        }
        return newLionCollection;
    }
}
