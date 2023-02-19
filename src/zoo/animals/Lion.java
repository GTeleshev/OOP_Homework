package zoo.animals;

public class Lion extends Animal implements Comparable<Lion> {
    protected int maneLength;
    protected static final int MAX_WEIGHT = 100;
    protected static final String TYPE = "Lion";

    @Override
    public String toString() {
        return "Lion{" +
                "maneLength=" + maneLength +
                ", birthYear=" + age +
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

    public Lion(int age, int weight, int limbsCount, int maneLegth) {
        super(age, weight, limbsCount);
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

    @Override
    public int compareTo(Lion o) {
        if (this.age > o.age) {
            return 1;
        }
        if (this.age < o.age) {
            return -1;
        } else return 0;
    }
}
