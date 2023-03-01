package zoo.terminal.menu;

public class Menu {
    public static final String[] OPTIONS = {
            "1. Удалить случайного льва(волка, змею) - Delete Lion(Wolf, Snake)",
            "2. Добавить случайного льва(волка, змею) - Create Lion(Wolf, Snake)",
            "3. Печатать зоопарк - PrintZoo",
            "4. Выйти - exit"};
    public static final String DIVIDER = "--------------------------------------";
    public static void printMenu(){
        System.out.println(DIVIDER);
        for (String el: OPTIONS) {
            System.out.println(el);
        }
        System.out.println(DIVIDER);
    }
}
