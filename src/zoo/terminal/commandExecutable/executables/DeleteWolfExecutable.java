package zoo.terminal.commandExecutable.executables;

import zoo.terminal.commandExecutable.CommandExecutable;
import zoo.zoo.Zoo;

public class DeleteWolfExecutable implements CommandExecutable {
    private Zoo zoo;

    public DeleteWolfExecutable(Zoo zoo) {
        this.zoo = zoo;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    @Override
    public void execute() {
        this.zoo.removeRandomWolf();
    }
}
