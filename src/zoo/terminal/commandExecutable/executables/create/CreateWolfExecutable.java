package zoo.terminal.commandExecutable.executables.create;

import zoo.factory.WolfFactory;
import zoo.terminal.commandExecutable.CommandExecutable;
import zoo.zoo.Zoo;

public class CreateWolfExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateWolfExecutable(Zoo zoo) {
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
        this.zoo.addWolf(WolfFactory.createRandomWolf());
    }
}
