package zoo.animalUtils;

import zoo.animals.Animal;
import zoo.animals.comparators.AnimalComparator;

import java.util.Collections;
import java.util.List;

//    Создать пэкедж animalUtils, работу продолжаем в нём
//    создать класс AnimalUtils и реализовать в нём статический метод для сортировки списка животных по возрасту
//    <T extends Animal> List<T> sortAnimals (List<T> animalList)
public class animalUtils {
    public static <T extends Animal> void sortAnimal(List<T> animalList) {
        Collections.sort(animalList, new AnimalComparator());
    }
}
