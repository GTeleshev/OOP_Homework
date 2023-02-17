package zoo.animals;

public class Lion extends Animal {
    protected int maneLength;

    @Override
    public String toString() {
        return "Lion{" +
                "maneLength=" + maneLength +
                ", birthYear=" + birthYear +
                ", weight=" + weight +
                ", limbsCount=" + limbsCount +
                '}';
    }

    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";

    public int getManeLength() {
        return this.maneLength;
    }

    public void setManeLength(int maneLength) {
        this.maneLength = maneLength;
    }

    public Lion(int birthYear, int weight, int limbsCount, int maneLegth){
        super(birthYear, weight, limbsCount);
        this.maneLength = maneLegth;
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
