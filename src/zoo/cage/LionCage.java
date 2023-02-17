package zoo.cage;
import zoo.animals.Animal;
import zoo.animals.Lion;
import java.util.ArrayList;
import java.util.Random;

public class LionCage implements AnimalCage{
    private int clean;
    private Random rand = new Random();
    private ArrayList<Lion> lions;
    public LionCage() {
        lions = new ArrayList<>();
    }

    @Override
    public int animalAdd(Animal lionToAdd) {
        if (lionToAdd instanceof Lion){
        lions.add((Lion) lionToAdd);
        }
        else {
            System.out.println("Not a lion");
        }
        return lions.size();
    }

    @Override
    public void foodTransfer(int foodWeight) {
        for(Lion el: lions){
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
    public Animal catchAnimal() {
        int index = rand.nextInt(lions.size());
        return lions.get(index);
    }

    @Override
    public String toString() {
        return "LionCage{" +
                "clean=" + clean +
                ", lions=" + lions.size() +
                '}';
    }
}
