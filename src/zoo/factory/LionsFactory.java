package zoo.factory;

import zoo.animals.Lion;

import java.util.ArrayList;
import java.util.Random;

//    Создать package – factory. Работу продолжаем в нем
//    Создать класс LionsFactory
//    Реализовать в нем статический метод для создания коллекции львов с определенным кол-вом в ней:
//    ArrayList<Lion> createLions (int lionCount)
//    В методе main создать коллекцию львов и положить её содержимое в клетку.
//    Посмотрите состояние львов, покормите львов в клетке, проверьте изменился ли у них вес.
public class LionsFactory {

    private static final Random RAND = new Random();


    public static Lion createRandomLion() {
        return new Lion(RAND.nextInt(50), RAND.nextInt(50), 4, RAND.nextInt(20));
    }

    public static ArrayList<Lion> createLionCollection(int lionCount) {
        ArrayList<Lion> newLionCollection = new ArrayList<>();
        for (int i = 0; i < lionCount; i++) {
            newLionCollection.add(createRandomLion());
        }
        return newLionCollection;
    }
}
