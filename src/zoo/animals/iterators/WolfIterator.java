package zoo.animals.iterators;

import zoo.animals.Wolf;

import java.util.Iterator;
import java.util.List;

public class WolfIterator implements Iterator<Wolf> {
    private final List<Wolf> wolfList;
    private int cursor;

    public WolfIterator(List<Wolf> wolfList1) {
        this.wolfList = wolfList1;
    }

    public int getCursor() {
        return this.cursor;
    }

    public void setCursor(int newPos) {
        this.cursor = newPos;
    }

    public void resetCursor() {
        this.cursor = 0;
    }

    @Override
    public boolean hasNext() {
        return cursor < wolfList.size();
    }

    @Override
    public Wolf next() {
        return wolfList.get(cursor++);
    }
}

