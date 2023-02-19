package zoo.animals.comparators;


import zoo.animals.Wolf;

import java.util.Comparator;

public class WolfComparator implements Comparator<Wolf> {
    //    Создать класс WolfComparator, реализующий сравнение волков по их весу и возрасту.
//    В классе WolfCage добавить метод сортировки волков, используя созданный WolfComparator
    @Override
    public int compare(Wolf o1, Wolf o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() == o2.getWeight()) {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else return 0;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        } else return 0;
    }
}

