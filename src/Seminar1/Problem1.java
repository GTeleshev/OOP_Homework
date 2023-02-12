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
        Product second = new Product("шоколад", 150);
        firstMachine.addProduct(first);
        firstMachine.addProduct(second);
        //
        Drink firstDrink = new Drink("кола", 100);
        firstDrink.setVolume(100);
        Drink secondDrink = new Drink("квас", 150);
        secondDrink.setVolume(150);
        //
        HotDrinkVendingMachine secondMachine = new HotDrinkVendingMachine("second machine");
        HotDrink firstHotDrink = new HotDrink("кофе", 200);
        firstHotDrink.setVolume(100);
        firstHotDrink.setTemperature(90);
        secondMachine.addProduct(firstHotDrink);
        HotDrink secondHotDrink = new HotDrink("какао", 180);
        secondHotDrink.setVolume(100);
        secondHotDrink.setTemperature(85);
        secondMachine.addProduct(secondHotDrink);
        System.out.println(secondHotDrink.getName() + ", цена: " + secondMachine.getProduct("какао", 100, 85).getPrice());
        //
        ArrayList<Product> products = new ArrayList<>();
        products.add(first);
        products.add(second);
        products.add(firstDrink);
        products.add(secondDrink);
        products.add(firstHotDrink);
        products.add(secondHotDrink);
        for (Product el: products) {
            el.consume();
        }
    }
}