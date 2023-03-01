package zoo.cage;

import zoo.animals.Wolf;
import zoo.animals.comparators.WolfComparator;
import zoo.animals.iterators.WolfIterator;
import zoo.factory.WolfFactory;

import java.util.*;

public class WolfCage implements AnimalCage<Wolf>, Iterable<Wolf> {
    private List<Wolf> wolves;
    private int clean;
    private WolfIterator wolfIter;

    public WolfCage() {
        this.wolves = new ArrayList<>();
        this.wolfIter = new WolfIterator(wolves);
    }

    public void sortByWeightAndAge() {
        Collections.sort(wolves, new WolfComparator());
    }

    public void printCage() {
        for (Wolf el : wolves
        ) {
            System.out.println(el);
        }
    }

    @Override
    public int animalAdd(Wolf wolfToAdd) {
        if (wolfToAdd instanceof Wolf) {
            wolves.add(wolfToAdd);
        } else {
            System.out.println("Not a wolf");
        }
        return wolves.size();
    }

    public void setWolves(ArrayList<Wolf> wolves) {
        this.wolves = wolves;
    }

    @Override
    public void collectionAdd(int animalCount) {
        this.setWolves(WolfFactory.createWolfCollection(animalCount));
    }

    @Override
    public void ageSort() {
        Collections.sort(wolves, new WolfComparator());
    }

    @Override
    public void foodTransfer(int foodWeight) {
        for (Wolf el : wolves) {
            el.feed(foodWeight / wolves.size());
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
    public Wolf catchAnimal() {
        Random rand = new Random();
        int index = rand.nextInt(wolves.size());
        if (wolves.size() > 0) {
            return wolves.get(index);
        } else return null;
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "clean=" + clean +
                ", wolves=" + wolves.size() +
                '}';
    }

    @Override
    public Iterator<Wolf> iterator() {
        return new WolfIterator(wolves);
    }

    public void deleteWolf(Wolf wolf) {
        System.out.println("Удаляем волка: ");
        System.out.println(wolf.toString());
        wolves.remove(wolf);
    }
}
