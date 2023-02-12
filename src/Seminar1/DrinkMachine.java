package Seminar1;

import java.util.ArrayList;

public class DrinkMachine extends VendingMachine {
    private ArrayList<Drink> drinkList;
    public DrinkMachine(String firstMachine) {
        super(firstMachine);
        drinkList = new ArrayList<Drink>();
    }
    public void addProduct(Drink dr){
        drinkList.add(dr);
    }
    public Drink getProduct(String name){
        for (Drink el: drinkList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }
}
