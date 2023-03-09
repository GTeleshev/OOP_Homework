package zoo.terminal.commandExecutable.executables;

import zoo.terminal.commandExecutable.CommandExecutable;

public class EmptyExecutable implements CommandExecutable {
    @Override
    public void execute() {
        System.out.println("Command not found. Try again");
    }
}
