package zoo.animals;

public class Wolf extends Animal {
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Wolf";

    public Wolf(int age, int weight, int limbsCount) {
        super(age, weight, limbsCount);
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
}
