package zoo.terminal;

import zoo.zoo.Zoo;

import java.util.Scanner;

public class TerminalReader {
    private static Scanner iScanner = new Scanner(System.in);
    private static TerminalReader singleton;
    private CommandParser commandParser;
    private Zoo zoo;
    private TerminalReader(CommandParser commandParser){
        this.commandParser = commandParser;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public static TerminalReader create(CommandParser commandParser){
        if(singleton == null){
            return new TerminalReader(commandParser);
        }
        return singleton;
    }
    public String loopScan(){
        CommandExecutable deleteLion = CommandExecutableFactory.create("DeleteLion", this.zoo);
        CommandExecutable addLion = CommandExecutableFactory.create("CreateLion", this.zoo);
        String command;
        while(true){
            System.out.println("1. Удалить случайного льва");
            System.out.println("2. Добавить случайного льва");
            System.out.println("3. Печатать зоопарк");
            System.out.println("exit - выйти");

            command = iScanner.next();
            switch (command) {
                case "1":
                    deleteLion.execute();
                    break;
                case "2":
                    addLion.execute();
                    break;
                case "3":
                    System.out.println(this.zoo.toString());
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }
}
