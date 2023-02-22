package Seminar1;

import java.util.ArrayList;

public class DrinkMachine extends VendingMachine<Drink> {
    public DrinkMachine(String firstMachine) {
        super(firstMachine);
        super.setProductList(new ArrayList<Drink>());
    }
}
