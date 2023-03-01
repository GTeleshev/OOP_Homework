package zoo.terminal.commandExecutable.executables;

import zoo.terminal.commandExecutable.CommandExecutable;
import zoo.zoo.Zoo;

public class PrintZooExecutable implements CommandExecutable {
    private final Zoo zoo;

    public PrintZooExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.printZoo();
    }
}
