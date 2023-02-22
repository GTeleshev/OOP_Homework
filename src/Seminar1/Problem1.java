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
        VendingMachine<Product> firstMachine = new VendingMachine<>("first machine");
        Product first = new Product("орешки", 100);
        Product second = new Product("шоколад", 150);
        firstMachine.addProduct(first);
        firstMachine.addProduct(second);
        firstMachine.printProducts();
        System.out.println("---------");
        //напитки
        Drink firstDrink = new Drink("кола", 100, 100);
        Drink secondDrink = new Drink("квас", 150, 150);
        //горячие напитки
        HotDrinkVendingMachine secondMachine = new HotDrinkVendingMachine("second machine");
        HotDrink firstHotDrink = new HotDrink("кофе", 200, 100, 90);
        HotDrink secondHotDrink = new HotDrink("какао", 180, 100, 85);
        secondMachine.addProduct(firstHotDrink);
        secondMachine.addProduct(secondHotDrink);
        System.out.println(secondMachine.getProduct("какао", 100, 85).getPrice());
        System.out.println("---------");
        //список продуктов
        ArrayList<Product> products = new ArrayList<>();
        products.add(first);
        products.add(second);
        products.add(firstDrink);
        products.add(secondDrink);
        products.add(firstHotDrink);
        products.add(secondHotDrink);
        for (Product el : products) {
            el.consume();
        }
        //проверка при загрузке в общую машину
        System.out.println("---------");
        VendingMachine<Product> crazyVendingMachine = new VendingMachine<>("crazy");
        crazyVendingMachine.setProductList(products);
        for (Product el : crazyVendingMachine.getProductList()) {
            crazyVendingMachine.getProduct(el.getName()).consume();
        }
    }
}