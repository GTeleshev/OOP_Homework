package zoo.terminal.commandExecutable.executables.create;

import zoo.factory.SnakeFactory;
import zoo.terminal.commandExecutable.CommandExecutable;
import zoo.zoo.Zoo;

public class CreateSnakeExecutable implements CommandExecutable {
    private Zoo zoo;

    public CreateSnakeExecutable(Zoo zoo) {
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
        this.zoo.addSnake(SnakeFactory.createRandomSnake());
    }
}
