package zoo.cage;

import zoo.animals.Snake;
import zoo.animals.comparators.AnimalComparator;
import zoo.factory.SnakeFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class SnakeCage implements AnimalCage<Snake> {
    private ArrayList<Snake> snakes;
    private int clean;

    public SnakeCage() {
        this.snakes = new ArrayList<>();
    }

    public void setSnakes(ArrayList<Snake> snakes) {
        this.snakes = snakes;
    }

    @Override
    public String toString() {
        return "SnakeCage{" +
                "clean=" + clean +
                ", snakes=" + snakes.size() +
                '}';
    }

    @Override
    public int animalAdd(Snake animalToAdd) {
        snakes.add(animalToAdd);
        return snakes.size();
    }

    @Override
    public void collectionAdd(int animalCount) {
        this.setSnakes(SnakeFactory.createSnakeCollection(animalCount));
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

    public void deleteSnake(Snake snake) {
        System.out.println("Удаляем змею: ");
        System.out.println((snake.toString()));
        snakes.remove(snake);
    }
}