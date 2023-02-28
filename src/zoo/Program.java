package zoo;

import zoo.animals.Lion;
import zoo.animals.Wolf;
import zoo.cage.LionCage;
import zoo.cage.WolfCage;
import zoo.factory.LionsFactory;
import zoo.factory.WolfFactory;
import zoo.terminal.CommandParser;
import zoo.terminal.TerminalReader;
import zoo.zoo.Zoo;

import java.util.ArrayList;
import java.util.Iterator;

public class Program {
//    Выполнить все задания из семинара 4
//    Имплементировать обобщенный интерфейс AnimalCage в классах SnakeCage и WolfCage

    public static void main(String[] args) {
        ArrayList<Lion> newColl = LionsFactory.createLionCollection(10);
        System.out.println(newColl);
        LionCage newCage = new LionCage();
        for (Lion el : newColl
        ) {
            newCage.animalAdd(el);
        }
        WolfCage secCage = new WolfCage();
        ArrayList<Wolf> secColl = WolfFactory.createWolfCollection(10);
        for (Wolf el : secColl) {
            secCage.animalAdd(el);
        }
        Zoo newZoo = new Zoo();
        newZoo.addLionCage(newCage);
        newZoo.addWolfCage(secCage);
        System.out.println(newZoo);
        TerminalReader newTerm = TerminalReader.create(new CommandParser() {
            @Override
            public String[] parseCommand(String inputCommand) {
                return new String[0];
            }
        });
        newTerm.setZoo(newZoo);
        newTerm.loopScan();
    }
}
