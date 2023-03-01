package zoo;

import zoo.terminal.TerminalReader;
import zoo.terminal.commandExecutable.execFactory.LoggingCommandExecutableFactory;
import zoo.terminal.commandParser.CommandParser;
import zoo.terminal.commandParser.ZooCommandParser;
import zoo.zoo.Zoo;

//    Выполнить все задания из семинара 4
//    Имплементировать обобщенный интерфейс AnimalCage в классах SnakeCage и WolfCage
public class Program {

    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        newZoo.populateZoo(50, 50, 50);
        CommandParser newCom = new ZooCommandParser();
        TerminalReader newTerm = TerminalReader.create(newCom, new LoggingCommandExecutableFactory());
        newTerm.setZoo(newZoo);
        newTerm.loopScan();
    }
}
