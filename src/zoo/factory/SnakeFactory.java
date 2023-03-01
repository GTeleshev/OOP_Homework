package zoo.factory;

import zoo.animals.Snake;

import java.util.ArrayList;
import java.util.Random;

public class SnakeFactory {
    private static final Random RAND = new Random();

    public static Snake createRandomSnake() {
        return new Snake(RAND.nextInt(50), RAND.nextInt(50), 20);
    }

    public static ArrayList<Snake> createSnakeCollection(int wolfCount) {
        ArrayList<Snake> newWolfCollection = new ArrayList<>();
        for (int i = 0; i < wolfCount; i++) {
            newWolfCollection.add(createRandomSnake());
        }
        return newWolfCollection;
    }
}
