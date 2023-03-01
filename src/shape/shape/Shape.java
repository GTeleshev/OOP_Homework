package shape.shape;

import java.util.List;

public abstract class Shape<T extends Number> {
    public abstract T perimeter();
    public abstract T area();
}
