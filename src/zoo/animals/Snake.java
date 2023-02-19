package zoo.animals;

public class Snake extends Animal {
    protected int bodyLength;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Snake";

    public Snake(int age, int weight, int limbsCount, int bodyLength) {
        super(age, weight, limbsCount);
        this.bodyLength = bodyLength;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "birthYear=" + age +
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

    public int getBodyLength() {
        return this.bodyLength;
    }

    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }
}
