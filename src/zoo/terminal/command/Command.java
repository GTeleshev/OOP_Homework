package zoo.terminal.command;

//- Создать класс Command, который бы инкапсулировал в себе содержимое введенной команды
//- Изменить сигнатуру у интерфейса ParseCommand, чтобы он вместо массива строк начал возвращать объект класса Command
//- Реализовать в нем булевские методы для проверки введенных команд
//- отредактировать класс CommandExecutableFactory, убрав из него хардкод и начав принимать на вход объект Command
public class Command {
    public static final String CREATE = "Create";
    public static final String DELETE = "Delete";
    public static final String PRINTZOO = "PrintZoo";
    public static final String EXIT = "Exit";
    public static final String LION = "Lion";
    public static final String WOLF = "Wolf";
    public static final String Snake = "Snake";

    private final String commandString;
    private final String animalToAct;

    public Command(String commandString, String Animal) {
        this.commandString = commandString;
        this.animalToAct = Animal;
    }

    public boolean isCreate() {
        return commandString.equalsIgnoreCase(CREATE);
    }

    public boolean isDelete() {
        return commandString.equalsIgnoreCase(DELETE);
    }

    public boolean isLion() {
        return animalToAct.equalsIgnoreCase(LION);
    }

    public boolean isWolf() {
        return animalToAct.equalsIgnoreCase(WOLF);
    }

    public boolean isSnake() {
        return animalToAct.equalsIgnoreCase(Snake);
    }

    public boolean isPrintZoo() {
        return commandString.equalsIgnoreCase(PRINTZOO);
    }

    public boolean isExit() {
        return commandString.equalsIgnoreCase(EXIT);
    }

    public String getCommandString() {
        return commandString;
    }
}
