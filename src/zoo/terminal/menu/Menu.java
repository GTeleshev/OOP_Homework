package zoo.terminal.menu;

public class Menu {
    public static final String[] OPTIONS = {
            "Команды:",
            "Удалить случайного льва(волка, змею) - Delete Lion(Wolf, Snake)",
            "Добавить случайного льва(волка, змею) - Create Lion(Wolf, Snake)",
            "Печатать зоопарк - PrintZoo",
            "Выйти - exit"};
    public static final String DIVIDER = "--------------------------------------";
    public static void printMenu(){
        System.out.println(DIVIDER);
        for (String el: OPTIONS) {
            System.out.println(el);
        }
        System.out.println(DIVIDER);
    }
}
