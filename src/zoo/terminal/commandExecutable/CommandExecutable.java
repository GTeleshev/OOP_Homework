package zoo.terminal.commandExecutable;

//    - Создать интерфейс CommandExecutable c абстрактным методом execute()
//- Реализовать 2 класса, имплементировав созданный интерфейс, CreateLionExecutable и
// DeleteLionExecutable. В унаследованных методах они должны обращаться
// к методом класса LionCage объекта Zoo.
// - Подумать какие переменные могли бы содержать созданные классы
public interface CommandExecutable {

    void execute();
}
