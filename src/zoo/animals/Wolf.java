package zoo.animals;

public class Wolf extends Animal {
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Snake";

    Wolf(int birthYear, int weight, int limbsCount) {
        super(birthYear, weight, limbsCount);
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "birthYear=" + birthYear +
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
