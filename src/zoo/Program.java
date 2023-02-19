package zoo;

import zoo.animals.Lion;
import zoo.animals.Wolf;
import zoo.animals.iterators.WolfIterator;
import zoo.cage.LionCage;
import zoo.cage.WolfCage;
import zoo.factory.LionsFactory;
import zoo.factory.WolfFactory;

import java.util.ArrayList;

public class Program {
    //    Создать класс WolfComparator, реализующий сравнение волков по их весу и возрасту.
//    В классе WolfCage добавить метод сортировки волков, используя созданный WolfComparator
//    Имплементировать в классе WolfCage интерфейс Iterable<Wolf> и реализовать логику итерации
//    по волкам в клетке с помощью класса WolfIterator
    public static void main(String[] args) {
        ArrayList<Lion> newColl = LionsFactory.createLionCollection(10);
        System.out.println(newColl);
        LionCage newCage = new LionCage();
        for (Lion el : newColl
        ) {
            newCage.animalAdd(el);
        }
        System.out.println(newCage);
        System.out.println(newCage.catchAnimal());
        newCage.foodTransfer(500);
        newCage.cageClean();
        newCage.ageSort();
        newCage.printCage();
        System.out.println("-------Sorting lions by mane---------");
        newCage.maneSort();
        newCage.printCage();
        WolfCage secCage = new WolfCage();
        ArrayList<Wolf> secColl = WolfFactory.createWolfCollection(10);
        for (Wolf el : secColl) {
            secCage.animalAdd(el);
        }
        secCage.printCage();
        System.out.println("-------Sorting wolves by weight and age ---------");
        secCage.sortByWeightAndAge();
        secCage.printCage();
        System.out.println("---------Iterating through wolf list------------");
        WolfIterator wolfIter = new WolfIterator(secColl);
        while (wolfIter.hasNext()) {
            Wolf nextWolf = wolfIter.next();
            System.out.println(nextWolf);
        }
    }
}
