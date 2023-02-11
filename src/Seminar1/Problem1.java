package Seminar1;

import java.util.ArrayList;

public class Problem1 {
//    Создать наследника реализованного класса HotDrink с дополнительным полем int температура
//    Создать класс HotDrinkVendingMachine наследника VendingMachine и реализовать перегруженный метод
//    getProduct(String name, double volume, double temperature), выдающий продукт соответствующего имени,
//    объема и температуры. Используйте при итерации конструкцию
//    if (product instance of HotDrink){ HotDrink ht = (HotDrink) product; }
//    В main проинициализировать несколько экземпляров HotDrink и один HotDrinkVendingMachine и
//    воспроизвести логику заложенную в программе. Все вышеуказанное создать согласно принципам
//    ООП пройдённым на семинаре
    public static void main(String[] args) {
        VendingMachine firstMachine = new VendingMachine("first machine");
        Product first = new Product("орешки", 100);
        Product second = new Product("газировка", 150);
        firstMachine.addProduct(first);
        firstMachine.addProduct(second);
//        firstMachine.printProducts();
        String newStr = firstMachine.returnProduct("орешки").getName();
        Integer newPrice = firstMachine.returnProduct("орешки").getPrice();
//        System.out.println(newStr);
//        System.out.println(newPrice);
        Drink firstDrink = new Drink("кофе", 100);
        firstDrink.setVolume(100);
        Drink secondDrink = new Drink("какао", 150);
        secondDrink.setVolume(150);
        ArrayList<Product> products = new ArrayList<>();
        products.add(first);
        products.add(second);
        products.add(firstDrink);
        products.add(secondDrink);
        for (Product el: products) {
            el.consume();
        }
    }
}