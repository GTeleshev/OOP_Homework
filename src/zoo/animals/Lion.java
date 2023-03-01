package zoo.animals;

import zoo.animals.interfaces.Limbs;
import zoo.animals.interfaces.Mane;

public class Lion extends Animal implements Comparable<Lion>, Limbs, Mane {
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";
    protected int maneLength;
    protected int limbsCount;

    public Lion(int age, int weight) {
        super(age, weight);
    }

    public Lion(int age, int weight, int limbsCount, int maneLegth) {
        super(age, weight);
        this.limbsCount = limbsCount;
        this.maneLength = maneLegth;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "maneLength=" + maneLength +
                ", age=" + age +
                ", weight=" + weight +
                ", limbsCount=" + limbsCount +
                '}';
    }

    public int getManeLength() {
        return this.maneLength;
    }

    public void setManeLength(int maneLength) {
        this.maneLength = maneLength;
    }

    @Override
    public int getMaxWeight() {
        return MAX_WEIGHT;
    }

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int compareTo(Lion o) {
        return Integer.compare(this.getAge(), o.getAge());
    }

    @Override
    public int getLimbsCount() {
        return this.limbsCount;
    }

    @Override
    public void setLimbsCount(int limbsCount) {
        this.limbsCount = limbsCount;
    }

    @Override
    public void walkLike() {
        System.out.println("Walk like a lion");
    }
}
