package zoo.animals.comparators;

import zoo.animals.Lion;

import java.util.Comparator;

public class LionComparator implements Comparator<Lion> {

    @Override
    public int compare(Lion o1, Lion o2) {
        if(o1.getManeLength() > o2.getManeLength()){
            return 1;
        } else if (o1.getManeLength() < o2.getManeLength()) {
            return -1;
        } else return 0;
    }
}
