package zoo.terminal.commandExecutable.executables.create;

import zoo.terminal.command.Command;
import zoo.terminal.commandExecutable.CommandExecutable;
import zoo.terminal.commandExecutable.executables.EmptyExecutable;
import zoo.zoo.Zoo;

public class CreateAnimalExecutable implements CommandExecutable {
    private Zoo zoo;
    private Command command;
    private CommandExecutable thisExec;

    public CreateAnimalExecutable(Zoo zoo, Command command) {
        this.zoo = zoo;
        this.command = command;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public CommandExecutable returnExec(){
        if(this.command.isLion()){
            this.thisExec = new CreateLionExecutable(this.zoo);
            return this.thisExec;
        } else if (this.command.isWolf()) {
            this.thisExec = new CreateWolfExecutable(this.zoo);
            return this.thisExec;
        } else if (this.command.isSnake()) {
            this.thisExec = new CreateSnakeExecutable(this.zoo);
            return this.thisExec;
        }
        else return new EmptyExecutable();
    }

    @Override
    public void execute() {
        this.thisExec.execute();
    }
}
