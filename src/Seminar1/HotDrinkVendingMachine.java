package Seminar1;

import java.util.ArrayList;

public class HotDrinkVendingMachine extends VendingMachine {
    private ArrayList<HotDrink> hotDrinkList;

    public HotDrinkVendingMachine(String firstMachine) {
        super(firstMachine);
        hotDrinkList = new ArrayList<>();
    }

    public void addProduct(HotDrink hd) {
        hotDrinkList.add(hd);
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product el : hotDrinkList) {
            if (el instanceof HotDrink) {
                if (el.name.equals(name) && ((HotDrink) el).volume == volume && ((HotDrink) el).temperature == temperature) {
                    return (HotDrink) el;
                }
            }
        }
        return null;
    }
}
