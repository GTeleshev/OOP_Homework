package zoo.factory;

import zoo.animals.Wolf;

import java.util.ArrayList;
import java.util.Random;


public class WolfFactory {

    private static final Random RAND = new Random();

    public static Wolf createRandomWolf() {
        return new Wolf(RAND.nextInt(50), RAND.nextInt(50), 4);
    }

    public static ArrayList<Wolf> createWolfCollection(int wolfCount) {
        ArrayList<Wolf> newWolfCollection = new ArrayList<>();
        for (int i = 0; i < wolfCount; i++) {
            newWolfCollection.add(createRandomWolf());
        }
        return newWolfCollection;
    }
}
