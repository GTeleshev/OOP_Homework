package zoo.cage;

import zoo.animals.Animal;
import zoo.animals.Wolf;

import java.util.ArrayList;
import java.util.Random;

public class WolfCage implements AnimalCage{
    private int clean;
    private ArrayList<Wolf> wolves;
    private Random rand = new Random();
    public WolfCage(){
        wolves = new ArrayList<>();
    }
    @Override
    public int animalAdd(Animal wolfToAdd) {
        if (wolfToAdd instanceof Wolf){
            wolves.add((Wolf) wolfToAdd);
        }
        else {
            System.out.println("Not a wolf");
        }
        return wolves.size();
    }

    @Override
    public void foodTransfer(int foodWeight) {
        for(Wolf el: wolves){
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
    public Animal catchAnimal() {
        int index = rand.nextInt(wolves.size());
        return wolves.get(index);
    }

    @Override
    public String toString() {
        return "WolfCage{" +
                "clean=" + clean +
                ", wolves=" + wolves.size() +
                '}';
    }
}
