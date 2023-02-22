package zoo.cage;

import zoo.animals.Snake;
import zoo.animals.comparators.AnimalComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SnakeCage implements AnimalCage<Snake> {
    private final ArrayList<Snake> snakes;
    private int clean;

    public SnakeCage() {
        this.snakes = new ArrayList<>();
    }

    @Override
    public int animalAdd(Snake animalToAdd) {
        snakes.add(animalToAdd);
        return snakes.size();
    }

    @Override
    public void ageSort() {
        Collections.sort(snakes, new AnimalComparator());
    }

    @Override
    public void foodTransfer(int foodWeight) {
        for (Snake el : snakes) {
            el.feed(foodWeight / snakes.size());
        }
        clean = foodWeight;
    }

    @Override
    public void cageClean() {
        clean = 0;
    }

    @Override
    public Snake catchAnimal() {
        Random rand = new Random();
        int index = rand.nextInt(snakes.size());
        if (snakes.size() > 0) {
            return snakes.get(index);
        } else return null;
    }
}
