package zoo.terminal.commandExecutable.executables.create;

import zoo.factory.LionsFactory;
import zoo.terminal.commandExecutable.CommandExecutable;
import zoo.zoo.Zoo;

public class CreateLionExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateLionExecutable(Zoo zoo) {
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
        this.zoo.addLion(LionsFactory.createRandomLion());
    }
}
