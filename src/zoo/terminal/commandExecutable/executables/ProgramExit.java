package zoo.terminal.commandExecutable.executables;

import zoo.terminal.commandExecutable.CommandExecutable;

public class ProgramExit implements CommandExecutable {
    @Override
    public void execute() {
        System.out.println("Goodbye");
        System.exit(0);
    }
}
