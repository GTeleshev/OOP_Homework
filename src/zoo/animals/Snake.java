package zoo.animals;

import zoo.animals.interfaces.ThinBody;

public class Snake extends Animal implements ThinBody {
    protected static final int MAX_WEIGHT = 20;
    protected static final String TYPE = "Snake";
    protected int bodyLength;

    public Snake(int age, int weight) {
        super(age, weight);
    }

    public Snake(int age, int weight, int bodyLength) {
        super(age, weight);
        this.bodyLength = bodyLength;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "bodyLength=" + bodyLength +
                ", age=" + age +
                ", weight=" + weight +
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
    public int getBodyLength() {
        return this.bodyLength;
    }

    @Override
    public void setBodyLength(int bodyLength) {
        this.bodyLength = bodyLength;
    }
}
