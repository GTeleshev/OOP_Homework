package Seminar1;

import java.util.ArrayList;

public class VendingMachine<T extends Product> {
    private ArrayList<T> productList;
    private String name;

    public VendingMachine(String firstMachine) {
        this.name = firstMachine;
        this.productList = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<T> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<T> productList) {
        this.productList = productList;
    }

    public void addProduct(T product) {
        productList.add(product);
    }

    public T getProduct(String name) {
        for (T el : productList) {
            if (el.getName().equals(name)) return el;
        }
        return null;
    }

    public void printProducts() {
        for (T el : this.productList
        ) {
            System.out.println(el);
        }
    }
}
