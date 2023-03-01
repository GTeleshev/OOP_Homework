package zoo.terminal.commandParser;

import zoo.terminal.command.Command;

import java.util.List;

public class ZooCommandParser implements CommandParser{
    @Override
    public Command parseCommand(String inputCommand) {
        String[] commandString = inputCommand.split(" ");
        System.out.println(commandString.length);
        if(commandString.length > 1){
            return new Command(commandString[0], commandString[1]);
        } else if (commandString.length == 1) {
            return new Command(commandString[0], "");
        }
        else return new Command("", "");
    }
}