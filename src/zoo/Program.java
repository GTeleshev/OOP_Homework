package zoo;
import java.util.ArrayList;

import zoo.animals.Lion;
import zoo.cage.LionCage;
import zoo.factory.LionsFactory;

public class Program {
//    Создать класс Wolf, наследника класса Animal.
//    Создать класс WolfCage, имплементирующий интерфейс AnimalCage
//    Добавить абстрактный метод в интерфейс AnimalCage, достающий первое попавшееся животное из клетки.
//    Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре
    public static void main(String[] args) {
        Lion firstLion = new Lion(10, 10, 10, 10);
        System.out.println(firstLion);
        firstLion.feed(100);
        System.out.println(firstLion.getWeight());
        ArrayList<Lion> newColl = LionsFactory.createLionCollection(50);
        System.out.println(newColl);
        LionCage newCage = new LionCage();
        for (Lion el: newColl
             ) {
            newCage.animalAdd(el);
        }
        System.out.println(newCage);
        System.out.println(newCage.catchAnimal());
        newCage.foodTransfer(2_000);
        newCage.cageClean();
    }
}
