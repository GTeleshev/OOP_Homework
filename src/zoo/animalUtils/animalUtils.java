package zoo.animalUtils;

import zoo.animals.Animal;
import zoo.animals.comparators.AnimalComparator;

import java.util.Collections;
import java.util.List;

public class animalUtils {
    //    - Создать пэкедж animalUtils, работу продолжаем в нём
//- создать класс AnimalUtils и реализовать в нём статический метод для сортировки списка животных по возрасту
//    <T extends Animal> List<T> sortAnimals (List<T> animalList)
    public static void sortAnimal(List<? extends Animal> animalList) {
        Collections.sort(animalList, new AnimalComparator());
    }

}
