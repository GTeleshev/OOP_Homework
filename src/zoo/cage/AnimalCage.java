package zoo.cage;
import zoo.animals.Animal;

public interface AnimalCage {
    public abstract int animalAdd(Animal animalToAdd);
    public abstract void foodTransfer(int foodWeight);
    public abstract void cageClean();
    public abstract Animal catchAnimal();
}
