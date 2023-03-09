package zoo.terminal.commandExecutable.execFactory;

import zoo.terminal.command.Command;
import zoo.terminal.commandExecutable.*;
import zoo.terminal.commandExecutable.executables.*;
import zoo.terminal.commandExecutable.executables.create.CreateAnimalExecutable;
import zoo.terminal.commandExecutable.executables.delete.DeleteAnimalExecutable;

import zoo.zoo.Zoo;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    public CommandExecutable create(Command command, Zoo zoo){
        if(command.isCreate()){
            CreateAnimalExecutable createAnimal = new CreateAnimalExecutable(zoo, command);
            return createAnimal.returnExec();
        }
        else if (command.isDelete()){
            DeleteAnimalExecutable deleteAnimal = new DeleteAnimalExecutable(zoo, command);
            return deleteAnimal.returnExec();
        } else if (command.isPrintZoo()) {
            return new PrintZooExecutable(zoo);
        } else if (command.isExit()) {
            return new ProgramExit();
        } else return new EmptyExecutable();
    }
}
