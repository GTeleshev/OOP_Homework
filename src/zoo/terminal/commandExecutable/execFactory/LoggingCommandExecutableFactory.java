package zoo.terminal.commandExecutable.execFactory;

import zoo.terminal.command.Command;
import zoo.terminal.commandExecutable.CommandExecutable;
import zoo.zoo.Zoo;

public class LoggingCommandExecutableFactory extends CommandExecutableFactoryImpl{
//    - Создать класс LogingCommandExecutableFactory, наследующий класс CommandExecutableFactory
//- Переопределить единственный метод так, чтобы он вызывал внутри себя метод предка, но в начале и конце распечатывал информацию о входных и выходных параметрах
    @Override
    public CommandExecutable create(Command command, Zoo zoo){
        System.out.println("Команда: " + command.getCommandString());
        System.out.println("Объект: " + zoo.toString());
        CommandExecutable outExec = super.create(command, zoo);
        System.out.println("Экземпляр: " + outExec.toString());
        return outExec;
    }
}
