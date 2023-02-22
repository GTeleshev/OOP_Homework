package zoo.cage;

import zoo.animals.Lion;
import zoo.animals.comparators.AnimalComparator;
import zoo.animals.comparators.LionComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LionCage implements AnimalCage<Lion> {
    private final ArrayList<Lion> lions;
    private int clean;

    public LionCage() {
        lions = new ArrayList<>();
    }

    @Override
    public int animalAdd(Lion lionToAdd) {
        lions.add(lionToAdd);
        return lions.size();
    }

    @Override
    public void foodTransfer(int foodWeight) {
        for (Lion el : lions) {
            el.feed(foodWeight / lions.size());
        }
        clean = foodWeight;
    }

    @Override
    public void cageClean() {
        System.out.println("Manure size in cage is: " + clean + " ... cleaning");
        clean = 0;
        System.out.println("Manure size in cage is: " + clean);
    }

    @Override
    public Lion catchAnimal() {
        Random rand = new Random();
        int index = rand.nextInt(lions.size());
        if (lions.size() > 0) {
            return lions.get(index);
        } else return null;
    }

    public void printCage() {
        for (Lion el : lions
        ) {
            System.out.println(el);
        }
    }

    public void maneSort() {
        Collections.sort(lions, new LionComparator());
    }

    public void ageSort() {
        Collections.sort(lions, new AnimalComparator());
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "clean=" + clean +
                ", lions=" + lions.size() +
                '}';
    }
}
