package zoo.animals;

import zoo.animals.interfaces.Limbs;

public class Wolf extends Animal implements Limbs {
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Wolf";
    protected int limbsCount;

    public Wolf(int age, int weight) {
        super(age, weight);
    }

    public Wolf(int age, int weight, int limbsCount) {
        super(age, weight);
        this.limbsCount = limbsCount;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "age=" + age +
                ", weight=" + weight +
                ", limbsCount=" + limbsCount +
                '}';
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
    public int getLimbsCount() {
        return limbsCount;
    }

    @Override
    public void setLimbsCount(int limbsCount) {
        this.limbsCount = limbsCount;
    }

    @Override
    public void walkLike() {
        System.out.println("Walk like a wolf");
    }
}
