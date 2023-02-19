package zoo.factory;

import zoo.animals.Wolf;

import java.util.ArrayList;
import java.util.Random;


public class WolfFactory {

    private static final Random rand = new Random();

    public static ArrayList<Wolf> createWolfCollection(int wolfCount) {
        ArrayList<Wolf> newWolfCollection = new ArrayList<>();
        for (int i = 0; i < wolfCount; i++) {
            newWolfCollection.add(new Wolf(rand.nextInt(50), 10, 4));
        }
        return newWolfCollection;
    }
}
