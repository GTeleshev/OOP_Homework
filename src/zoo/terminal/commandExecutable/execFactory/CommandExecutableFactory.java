package zoo.terminal.commandExecutable.execFactory;

import zoo.terminal.command.Command;
import zoo.terminal.commandExecutable.CommandExecutable;
import zoo.zoo.Zoo;

public interface CommandExecutableFactory {
    public CommandExecutable create(Command command, Zoo zoo);
}
